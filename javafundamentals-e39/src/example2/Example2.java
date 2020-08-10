package example2;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Example2 {

    public static void main(String[] args) {

        Stream<Integer> s1 = Stream.empty(); // finite source

        Stream<Integer> s2 = Stream.of(3, 5, 6, 7, 8, 9); // finite source
//        s2.forEach(System.out::println);

        Supplier<Integer> supplier = () -> new Random().nextInt();
        Stream<Integer> s3 = Stream.generate(supplier); // infinite source
//        s3.forEach(System.out::println);

//        s3.limit(10)
//                .forEach(System.out::println);

        Stream<Integer> s4 = Stream.iterate(1, integer -> integer + 1); // infinite
        s4.limit(10)
                .forEach(System.out::println);

        Stream<Integer> s5 =
                Stream.iterate(1, // starting with Java9
                        i -> i <= 10,
                        i -> i + 1); // finite
        s5.forEach(System.out::println);

        System.out.println(":)");
    }

    /*public List<Integer> m1() {
        // Instead of returning null

        return Collections.emptyList();
    }*/

    public Stream<Integer> m1() {
        // Instead of returning null

        return Stream.empty();
    }
}
