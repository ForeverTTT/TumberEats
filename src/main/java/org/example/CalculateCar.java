package org.example;

public class CalculateCar implements PriceStrategy {

  @Override
  public double calculatePrice(double distance) {
    if (distance <= 0) {
      throw new IllegalArgumentException(PriceStrategy.ILLEGAL_DISTANCE_MESSAGE);
    }
    return 3.2 + distance / 2.6;
  }
}
