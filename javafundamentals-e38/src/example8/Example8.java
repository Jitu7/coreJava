package example8;

import java.util.function.UnaryOperator;

/*
UnaryOperator -> what we receive and return are same
 */
public class Example8 {

    public static void main(String[] args) {

        UnaryOperator<Integer> u = n -> n + 1;
        Integer i = u.apply(1);

        System.out.println(i);

    }

}
