package com.general.java.examples;

import java.util.Objects;
import java.util.StringJoiner;

public final class JavaProductWithPrice {

  private final String name;
  private final String id;
  private final double price;

  public JavaProductWithPrice(String id, String name, double price) {
    this.id = id;
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public String getId() {
    return id;
  }

  public double getPrice() {
    return price;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JavaProductWithPrice that = (JavaProductWithPrice) o;
    return Double.compare(that.price, price) == 0 && Objects.equals(name, that.name) && Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, price);
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", JavaProductWithPrice.class.getSimpleName() + "[", "]").add("name='" + name + "'")
        .add("id='" + id + "'")
        .add("price=" + price)
        .toString();
  }

  public void isPriceEquals(JavaProductWithPrice product) {

    System.out.print("[JAVA] IS EQUALS = " );
    System.out.println(this.getPrice() == product.getPrice());
  }

  public static void main(String[] args) {

    JavaProductWithPrice iphone = new JavaProductWithPrice("1", "iphone", 200.0);
    JavaProductWithPrice iphoneX = new JavaProductWithPrice("2", "iphoneX", 200.0);
    iphone.isPriceEquals(iphoneX);


  }
}
