package com.jyotirmayadas;

/**
 * For decimal numbers we have
 *  float, double
 *
 *  in java any decimal number is treated as double
 *  to explicitly make it as float we have to use 'f' or 'F'
 */
public class Example2 {

    public static void main(String[] args) {

        double d1 = 10.5;
        float f1 = 10.5f;
        float f2 = (float) d1;

        d1 = f1;
        f1 = (float) d1;

        int i1 = (int) d1;
        System.out.println(i1);

    }
}
