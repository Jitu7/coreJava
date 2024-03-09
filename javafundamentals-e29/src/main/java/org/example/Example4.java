package org.example;

public class Example4 {

    public static void main(String[] args) {
        int x = m();
        System.out.println(x);
    }

    public static int m() {
        try {
            return 10;
        } finally {
            System.out.println(":)"); // finally, will execute before return of try but avoid this wrt clean code pov
        }
    }
}
