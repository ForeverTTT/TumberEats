package org.example;

public class CalculateBike implements PriceStrategy {
    @Override
    public double calculatePrice(double distance) {
        return 2.0 + distance / 2.8;
    }
}
