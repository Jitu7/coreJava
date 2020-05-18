package main;

public class Example4 {

    public static void main(String[] args) {
        // &&   &   --- AND

        // && -> short circuit operator
        // if first expression is false then it is not evaluating the second

        // T  &&  T     T
        // F  &&  T     F
        // T  &&  F     F
        // F  &&  F     F

        boolean b1 = true;
        boolean b2 = false;

        boolean res = b1 && b2;

        System.out.println(res);
    }
}
