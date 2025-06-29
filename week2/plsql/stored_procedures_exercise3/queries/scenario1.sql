CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest AS
BEGIN
  UPDATE Accounts
  SET balance = balance + (balance * 0.01)
  WHERE account_type = 'SAVINGS';
END;
