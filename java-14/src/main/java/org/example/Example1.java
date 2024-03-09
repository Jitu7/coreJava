package org.example;

public class Example1 {

    public static void main(String[] args) {
        Number n = 10;

        if (n instanceof Integer) {
            Integer i = (Integer) n;
            System.out.println(i);
        }

    }
}
