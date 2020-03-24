package com.jyotirmayadas;

public class Example2 {

    public static void main(String[] args) {

        int[] x;
        x = new int[5];

        int[] y1 = {}; // length  0
        int[] y2 = {2, 5, 8, 7}; // length 4

        int[] z1 = new int[] {1, 2, 3}; // length 3

        var q1 = new int[10];
//        var q2 = {1, 2, 3}; NOT POSSIBLE
        var q3 = new int[] {1, 2, 3, 4}; // length 4

        m(q1);
        m(new int[5]);
//        m({1, 2, 2}); NOT POSSIBLE
        m(new int[] {1, 2, 3});
    }

    public static void m(int[] z) {

    }
}
