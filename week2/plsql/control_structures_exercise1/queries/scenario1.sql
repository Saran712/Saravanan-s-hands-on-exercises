BEGIN
  FOR rec IN (SELECT customer_id FROM Customers WHERE age > 60) LOOP
    UPDATE Loans
    SET interest_rate = interest_rate - 1
    WHERE customer_id = rec.customer_id;
  END LOOP;
END;
