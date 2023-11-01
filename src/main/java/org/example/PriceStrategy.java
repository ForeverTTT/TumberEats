package org.example;

public interface PriceStrategy {

  String ILLEGAL_DISTANCE_MESSAGE = "The input for the distance is invalid";

  double calculatePrice(double distance);
}
