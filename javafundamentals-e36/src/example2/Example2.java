package example2;

import java.util.TreeSet;

public class Example2 {

    public static void main(String[] args) {
        var set1 = new TreeSet<>(); // TreeSet --> Black Red Tree
        set1.add(new Cat(4));
        set1.add(new Cat(1));
        set1.add(new Cat(6));
        set1.add(new Cat(2));

        set1.forEach(System.out::println);
    }

}
