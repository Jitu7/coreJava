package com.jyotirmayadas;

import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.print("X: ");
        int x = scanner.nextInt();
        System.out.print("Y: ");
        int y = scanner.nextInt();

//        boolean condition = x < y;

        // ?:

        int result = x < y ? 50 : 100;
        System.out.println(result);
    }
}
