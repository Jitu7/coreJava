package org.example;

public class Example8 {

    /*
    To avoid duplicate code, use multi catch
     */
    public static void main(String[] args) {
        try {
            int x = m();
            System.out.println(x);
        } catch (ArithmeticException | NullPointerException ex) {
            System.out.println(":)");
        }
    }

    public static int m() {
        int x = 1/0; // ArithmeticException
        return x;
    }
}
