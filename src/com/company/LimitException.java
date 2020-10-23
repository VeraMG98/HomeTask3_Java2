package com.company;

public class LimitException extends Exception {
    private final double remainingAmount;

    public LimitException(String massage, double remainingAmount) {
        super(massage);
        this.remainingAmount = remainingAmount;
    }

    public double getRemainingAmount() {
        return remainingAmount;
    }
}
