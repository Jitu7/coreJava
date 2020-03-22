package com.jyotirmayadas;

/**
 * 2 types primitive, reference
 * primitive
 * ---------
 *  1byte - 8bit
 *                16-bit         32-bit          64-bit     32-bit        64-bit
 *                ------         ------          ------     ------        -------
 *  byte < short(2 byte) < int(4 byte) < long(8 byte) < float(4 byte)  < double
 *  char - 2byte, boolean
 *
 *  by default integral representation is int
 *  and decimal representation is double
 *
 */
public class Example1 {

    public static void main(String[] args) {

        byte b1; // 8-bit  2^8 = 256 [-128, 127] including zero
        b1 = 10;

        System.out.println(b1);

        byte b2 = 20;
        System.out.println(b2);

        short s1; // 16-bit
        int i1; //  32-bit
        long w1; // 64-bit

//        w1 = 9999999999; //   It will consider it from right side so it will treat it as integer

        // in order to tell java to consider it as long we have to tell java by placing a small or capital L at the end
        w1 = 9999999999L; //    L-> Literal

        int z1, z2 = 50, z3;

        z1 = 045; // base-8 [0-7]
        System.out.println(z1); // base-10

        z3 = 0xFF; // base-16 A - F [0, F]
        System.out.println(z3); // base-10

        z2 = 0b101101010; // from SE-7 we can use binary numbers also [0, 1]
        System.out.println(z2);


    }

}
