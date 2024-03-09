package org.example;

public class Example5 {

    public static void main(String[] args) {
        int x = m();
        System.out.println(x); // 20
    }

    public static int m() {
        try {
            return 10;
        } finally {
            return 20; // finally, will execute before return of try but avoid this wrt clean code pov
        }
    }
}
