package com.jyotirmayadas;

public class Example8 {

    public static void main(String[] args) {
        var i = 1;

        while (i < 10) {
            i = i + 1;
            if (i % 2 == 0) continue;
            System.out.println(i);
        }
    }
}
