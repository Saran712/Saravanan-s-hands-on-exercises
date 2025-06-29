package com.example.JUnitDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest1 {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup complete");
    }

    @AfterEach
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown complete");
    }

    @Test
    public void testAddition() {
        // Act
        int result = calculator.add(3, 4);

        // Assert
        assertEquals(7, result);
    }

    @Test
    public void testMultiplication() {
        int result = calculator.multiply(2, 5);
        assertEquals(10, result);
    }

    @Test
    public void testDivision() {
        int result = calculator.divide(10, 2);
        assertEquals(5, result);
    }
}
