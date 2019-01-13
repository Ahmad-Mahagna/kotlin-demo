package com.general.java.examples;

import java.util.Objects;
import java.util.StringJoiner;

import com.general.kotlin.demo.Product;

public final class JavaProduct {

  private final String name;
  private final String id;

  public JavaProduct(String id, String name) {
    this.id = id;
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public String getId() {
    return id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JavaProduct that = (JavaProduct) o;
    return Objects.equals(name, that.name) && Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id);
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", JavaProduct.class.getSimpleName() + "[", "]").add("name='" + name + "'")
        .add("id='" + id + "'")
        .toString();
  }

  public static void main(String[] args) {
    Product product = new Product("1","ipjone", 200.0);

    product.getId()

  }
}
