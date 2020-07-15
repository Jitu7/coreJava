package example1;

import java.util.TreeSet;

/*
Collections(C) util class vs Collection(I)
Collection.sort() does n't compile
 */
public class Example1 {

    public static void main(String[] args) {
        var set1 = new TreeSet<>(); // TreeSet --> Black Red Tree
        /*
        java.lang.ClassCastException: class example1.Cat cannot be cast to class java.lang.Comparable
         */
        set1.add(new Cat(4));
        set1.add(new Cat(1));
        set1.add(new Cat(6));
        set1.add(new Cat(2));

        set1.forEach(System.out::println);
    }

}
