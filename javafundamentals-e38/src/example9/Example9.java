package example9;

import java.util.function.BinaryOperator;

/*
BinaryOperator -> both return and consume types are same
 */
public class Example9 {

    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a, b) -> a * b;
        Integer x = binaryOperator.apply(10, 2);

        System.out.println(x);
    }

}
