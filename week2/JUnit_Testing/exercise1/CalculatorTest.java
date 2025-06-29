package com.example.JUnitDemo;

import static org.junit.Assert.assertEquals;


import org.junit.jupiter.api.Test;


public class CalculatorTest {

   
	@Test
    public void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));
        System.out.println("Add function is tested successfully");
    }
}
