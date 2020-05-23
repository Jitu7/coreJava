package main;

import second.B; // if class is from another package

public class Example1 {

    public static void main(String[] args) {
//        second.B b = new second.B();
        B b = new B();
        A a = new A(); // from main package
        second.A a1 = new second.A(); // from second package
    }
}
