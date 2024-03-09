package org.example;

public class Example6 {

    public static void main(String[] args) {
        try {
            int x = m();
            System.out.println(x);
        } catch (ArithmeticException ex) {
            System.out.println(":)");
        }
    }

    public static int m() {
        int x = 1/0; // ArithmeticException
        return x;
    }
}
