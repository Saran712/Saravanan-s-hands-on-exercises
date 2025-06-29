CREATE OR REPLACE PROCEDURE TransferFunds(
  from_acc IN NUMBER,
  to_acc IN NUMBER,
  amount IN NUMBER
) AS
  insufficient_balance EXCEPTION;
  from_balance NUMBER;
BEGIN
  -- Check balance
  SELECT balance INTO from_balance FROM Accounts WHERE account_id = from_acc;
  
  IF from_balance < amount THEN
    RAISE insufficient_balance;
  END IF;

  -- Deduct from sender
  UPDATE Accounts SET balance = balance - amount WHERE account_id = from_acc;

  -- Add to receiver
  UPDATE Accounts SET balance = balance + amount WHERE account_id = to_acc;
  
  COMMIT;
EXCEPTION
  WHEN insufficient_balance THEN
    DBMS_OUTPUT.PUT_LINE('Insufficient funds in source account.');
  WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE('Transfer failed: ' || SQLERRM);
    ROLLBACK;
END;
