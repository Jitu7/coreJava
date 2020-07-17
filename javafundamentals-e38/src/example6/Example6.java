package example6;

import java.util.function.Predicate;

/*
Predicate -> consumes one and always returns boolean
 */
public class Example6 {

    public static void main(String[] args) {

        Predicate<Integer> p1 = x -> x % 2 == 0;

        boolean b1 = p1.test(10);
        boolean b2 = p1.test(5);

        System.out.println(b1);
        System.out.println(b2);

    }

}
