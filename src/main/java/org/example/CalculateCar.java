package org.example;

public class CalculateCar implements PriceStrategy {
    @Override
    public double calculatePrice(double distance) {
        return 3.2 + distance / 2.6;
    }
}
