package main;

import java.util.List;

public class Example5 {

    public static void main(String[] args) {

        // skip()
        // peek()
        // takeWhile() -- SE9
        // dropWhile() -- SE9

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // we can apply skip() any no of times we want, we can apply filter after that skip some element,
        // or before filter() apply skip()....etc
        list.stream()
                .skip(4)
                .forEach(System.out::println);

        list.stream()
                .skip(2)
                .filter(integer -> integer % 2 == 0)
                .skip(4)
                .forEach(System.out::println);


    }

}
