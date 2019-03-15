package com.kishan;

public class ScroogeMoney {
    public static void main(String... args){

        System.out.println(Money.calculateYears(1000,0.05,0.18,1100));
    }
}

class Money {
    public static int calculateYears(double principal, double interest,  double tax, double desired) {
        int years = 0;
        while (principal < desired) {
            principal += principal * interest * (1 - tax);
            years++;
        }
        return years;

//        Way2
//        return (int) Math.ceil(Math.log(desired / principal) / Math.log(1 + interest * (1 - tax)));
    }
}