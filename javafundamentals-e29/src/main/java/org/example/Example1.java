package org.example;

public class Example1 {

    // a() -> b() -> c()
    public static void main(String[] args) {
        m();
    }

    public static void m() {
        int x = 1 / 0; // Arithmetic exception
        System.out.println(x);
    }
}
