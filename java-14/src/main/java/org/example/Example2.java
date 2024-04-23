package org.example;

public class Example2 {

    public static void main(String[] args) {
        Number n = 10;

        if (n instanceof Integer i) {
            System.out.println(i);
        }

        if (n instanceof Integer i && i == 20) {
            System.out.println(i);
        }

        /*
        CE: can not find symbol i, because there is a possibility of 1st condition
        might become false
         */
        /*if (n instanceof Integer i || i == 20) { // CE
            System.out.println(i);
        }*/
    }
}
