package main;

import java.util.stream.Stream;

public class Example3 {

    public static void main(String[] args) {
        Stream.of(
                new Cat(3),
                new Cat(5),
                new Cat(1),
                new Cat(2),
                new Cat(3),
                new Cat(6)
        )
                .distinct()
                .sorted((o1, o2) -> o1.getAge() - o2.getAge())
                .forEach(System.out::println);


    }

}
