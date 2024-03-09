package org.example;

public class Example7 {

    /*
    In multiple catch blocks always go from more particular first than more general
     */
    public static void main(String[] args) {
        try {
            int x = m();
            System.out.println(x);
        } catch (ArithmeticException ex) {
            System.out.println(":)");
        } catch (NullPointerException ex) {
            System.out.println(":)");
        } catch (RuntimeException ex) {
            System.out.println(":)");
        }
    }

    public static int m() {
        int x = 1/0; // ArithmeticException
        return x;
    }
}
