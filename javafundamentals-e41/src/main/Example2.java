package main;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Example2 {

  public static void main(String[] args) {
    List<Integer> list = List.of(3, 5, 2, 3, 1, 8, 9, 5);

    Comparator<Integer> reverseOrder = Collections.reverseOrder();

    list.stream()
      .distinct()
      .sorted(reverseOrder)
      .forEach(System.out::println);

  }

}
