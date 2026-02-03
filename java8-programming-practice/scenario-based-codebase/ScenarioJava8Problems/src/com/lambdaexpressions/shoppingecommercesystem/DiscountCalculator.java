package com.lambdaexpressions.shoppingecommercesystem;

@FunctionalInterface
public interface DiscountCalculator {
    double apply(double price);
}
