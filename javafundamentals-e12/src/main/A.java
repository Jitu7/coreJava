package main;

public class A {

    // Overloading applies to both constructors, methods
    void a() {
    }

    // by number
    // by type of at least one of them
    // order of types
    int a(int x) {
        return x;
    }

    void a(double x) {

    }

    void a(int x, double y) {

    }

    void a(String x, double y) {

    }

    void a(Cat c) {

    }

    void a(String s) {

    }


}
