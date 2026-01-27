package com.junit.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

import com.junit.main.Calculator;

public class CalculatorTest2 {

    @Test
    public void testDivideNormal() {
        assertEquals(5, Calculator.divide(10, 2));
        assertEquals(-3, Calculator.divide(9, -3));
    }

    @Test
    public void testDivideByZero() {
        ArithmeticException exception = assertThrows(
            ArithmeticException.class,
            () -> Calculator.divide(10, 0)
        );
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}

