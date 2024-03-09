package org.example;

/*
Helpful NPE
 */
public class Example6 {

    public static void main(String[] args) {
        m1().m2().m3(); //NPE
    }

    static Example6 m1() {
        return new Example6(); // not null
    }

    Example6 m2() {
        return null; // null
    }

    void m3() {
        System.out.println(":)"); // not null
    }
}
