package main;

import java.util.List;

public class Example1 {

  public static void main(String[] args) {
    List<Integer> list = List.of(3, 5, 2, 3, 1, 8, 9, 5);

    // distinct()
    // sorted() / sorted(Comparator)

    list.stream()
      .distinct()
      .sorted() // Comparable
      .forEach(System.out::println);

  }

}
