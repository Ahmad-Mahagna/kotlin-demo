package com.general.java.examples;

public class JavaChargerCompatible {

  public static String chargerByPhoneName(String phoneName, int model) {

    String result;

    switch (phoneName) {
      case "SAMSUNG":
        result = samsungCharger(model);
        break;
      case "IPHONE":
        result = "Apply only";
        break;
      case "ONEPLUS":
        result = "usb-c type";
        break;
      default:
        result = "Unknown";
    }
    return result;
  }

  private static String samsungCharger(int model) {

    String result;

    switch (model) {

      case 1:
      case 2:
      case 3:
        result = "USB";
        break;

      case 4:
        result = "USB-C type";
        break;
      default:
        result = "UNKNOWN";
    }

    return result;

  }

}
