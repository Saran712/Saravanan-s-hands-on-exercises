BEGIN
  FOR rec IN (
    SELECT l.LoanID
    FROM Customers c
    JOIN Loans l ON c.CustomerID = l.CustomerID
    WHERE FLOOR(MONTHS_BETWEEN(SYSDATE, c.DOB) / 12) > 60
  ) LOOP
    UPDATE Loans
    SET InterestRate = InterestRate * 0.99
    WHERE LoanID = rec.LoanID;
  END LOOP;
  COMMIT;
END;
/
