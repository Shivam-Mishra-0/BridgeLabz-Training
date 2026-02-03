package com.lambdaexpressions.employeemanagementsystem;

@FunctionalInterface
public interface PromotionCheck {
    boolean isEligible(int experience);
}
