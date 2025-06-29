CREATE OR REPLACE PROCEDURE TransferFunds(
  p_FromAccountID IN NUMBER,
  p_ToAccountID IN NUMBER,
  p_Amount IN NUMBER
) IS
  v_Balance NUMBER;
BEGIN
  -- Check source balance
  SELECT Balance INTO v_Balance
  FROM Accounts
  WHERE AccountID = p_FromAccountID;

  IF v_Balance >= p_Amount THEN
    -- Deduct from source
    UPDATE Accounts
    SET Balance = Balance - p_Amount
    WHERE AccountID = p_FromAccountID;

    -- Add to destination
    UPDATE Accounts
    SET Balance = Balance + p_Amount
    WHERE AccountID = p_ToAccountID;

    COMMIT;
  ELSE
    RAISE_APPLICATION_ERROR(-20001, 'Insufficient funds');
  END IF;
END;
/
