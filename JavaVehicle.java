package com.general.java.examples;

public class JavaVehicle {

  private String name;

  public JavaVehicle(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }


  public class JavaVan extends JavaVehicle {

    private String transportingType;

    public JavaVan(String name, String transportingType) {
      super(name);
      this.transportingType = transportingType;
    }

    public String getTransportingType() {
      return transportingType;
    }
  }



  public class JavaPrivateCar extends JavaVehicle {

    private String classification;

    public JavaPrivateCar(String name, String classification) {
      super(name);
      this.classification = classification;
    }

    public String getClassification() {
      return classification;
    }
  }


  public String extractType(JavaVehicle vehicle) {

    if (vehicle instanceof JavaPrivateCar) {
      return ((JavaPrivateCar) vehicle).getClassification();
    }else if (vehicle instanceof JavaVan) {
      return ((JavaVan) vehicle).transportingType;
    } else {
      return "unknown";
    }

  }
}






