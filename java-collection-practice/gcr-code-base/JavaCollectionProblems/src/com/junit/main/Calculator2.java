package com.junit.main;

public class Calculator2 {

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        } 
        return a / b;
    }
}

