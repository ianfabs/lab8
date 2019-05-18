package com.example.lab8;

public class BulkDiscount extends DiscountPolicy {
    private int Min;
    private double Perc;
    public BulkDiscount(int min, double percent) {
        Min = min;
        Perc = percent;
    }
    @Override
    public double computeDiscount(double count, double cost) {
        return count > Min ? (cost*count) * Perc : 0;
    }
}
