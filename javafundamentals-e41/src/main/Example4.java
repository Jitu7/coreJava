package main;

import java.util.stream.Stream;

public class Example4 {

  public static void main(String[] args) {
    Stream.of(
      new Dog(3),
      new Dog(2),
      new Dog(2),
      new Dog(1),
      new Dog(5),
      new Dog(6)
    )
      .distinct()
      .sorted()
      .forEach(System.out::println);

  }
}
