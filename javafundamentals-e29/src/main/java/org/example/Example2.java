package org.example;

public class Example2 {

    // a() -> b() -> c()
    public static void main(String[] args) {
        // try - catch - finally
        // try - catch
        // try - finally
        // try()
        try {
            int x = m();
            System.out.println(x);
        } finally {
            System.out.println(":)");
        }
    }

    public static int m() {
        int x = 1 / 0; // Arithmetic exception
        return x;
    }
}
