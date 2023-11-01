package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

class CalculateCarTest {

  @Test
  void testImplementsPriceStrategy() {
    CalculateCar testCar = new CalculateCar();

    assertThat(testCar).as(
            "Your implementation of CalculateCar is not correct with regard to inheritance")
        .isInstanceOf(PriceStrategy.class);
  }

  @Test
  void assertFailsWithNegativeInput() {
    CalculateCar testCar = new CalculateCar();

    assertThatThrownBy(() -> testCar.calculatePrice(-10)).as(
        "Your code does not behave correctly for invalid distances.").isInstanceOf(
        IllegalArgumentException.class).hasMessage(PriceStrategy.ILLEGAL_DISTANCE_MESSAGE);
  }

  @Test
  void assertFailsWithZeroInput() {
    CalculateCar testCar = new CalculateCar();

    assertThatThrownBy(() -> testCar.calculatePrice(0)).as(
        "Your code does not behave correctly for invalid distances.").isInstanceOf(
        IllegalArgumentException.class).hasMessage(PriceStrategy.ILLEGAL_DISTANCE_MESSAGE);
  }

  @Test
  void assertCalculationCorrectSimple() {
    CalculateCar testCar = new CalculateCar();

    double cost = testCar.calculatePrice(26);

    assertThat(cost).as("Your cost calculation returns the wrong value").isEqualTo(13.2);

  }

  @Test
  void assertCalculationCorrectComplex() {
    CalculateCar testCar = new CalculateCar();

    double cost = testCar.calculatePrice(24.7);

    assertThat(cost).as("Your cost calculation returns the wrong value").isEqualTo(12.7);

  }

}
