package example1;

import java.util.List;

public class Example2 {

    public static void main(String[] args) {

        List<String> list = List.of("abcd", "qwerty", "asdfg");

        list.stream() // "abcd", "qwerty", "asdfg"
                .map(Example2::reverse)
                .forEach(System.out::println);

    }

    private static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
