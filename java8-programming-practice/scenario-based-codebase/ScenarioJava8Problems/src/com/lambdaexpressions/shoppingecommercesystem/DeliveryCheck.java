package com.lambdaexpressions.shoppingecommercesystem;

@FunctionalInterface
public interface DeliveryCheck {
    boolean isFree(double amount);
}
