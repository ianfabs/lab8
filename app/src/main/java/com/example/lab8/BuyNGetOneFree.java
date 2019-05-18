package com.example.lab8;

public class BuyNGetOneFree extends DiscountPolicy {
    private double N;
    public BuyNGetOneFree(int n) {
        N = n;
    }

    @Override
    public double computeDiscount(double count, double cost) {
        double d = 0;
        for(int i=1;i<=count;i++) {
            if (i%N == 0) d += cost;
            System.out.println(i+"%"+N+"="+i%N+"");
        }
        return d;
    }
}
