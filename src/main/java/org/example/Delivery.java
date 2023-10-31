package org.example;

public class Delivery {
    private double distance;

    private PriceStrategy priceCalculatingAlg;

    public Delivery() {
    }

    public Delivery(double distance, PriceStrategy priceCalculatingAlg) {
        this.distance = distance;
        this.priceCalculatingAlg = priceCalculatingAlg;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public PriceStrategy getPriceCalculatingAlg() {
        return priceCalculatingAlg;
    }

    public void setPriceCalculatingAlg(PriceStrategy priceCalculatingAlg) {
        this.priceCalculatingAlg = priceCalculatingAlg;
    }

    public double calculatePrice() {
        return priceCalculatingAlg.calculatePrice(this.distance);
    }
}
