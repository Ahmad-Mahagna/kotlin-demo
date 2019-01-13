package com.general.java.examples;

public class JavaShippingCost {

  public static Double shippingCostByKg(Double weight) {

    if (weight > 10) {
      return 100.0;
    } else {
      return 10.0;
    }

  }
}
