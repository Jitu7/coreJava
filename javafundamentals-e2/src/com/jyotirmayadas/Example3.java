package com.jyotirmayadas;

/**
 * Java is working with unicode representation.
 * we use \\u to take the value from unicode table
 * char is always a single character.
 * String is a combination of multiple char
 */
public class Example3 {

    public static void main(String[] args) {
        char c1, c2, c3; // 2 byte = 16-bit

        c1 = 'a';
        c2 = '\n'; // \b -> backspace, \t
        c3 = '\u0065'; // UTF 0065 - e

        System.out.print(c1);
        System.out.print(c2);
        System.out.print(c1);
        System.out.print(c2);
        System.out.println(c3);

//        char is actually a numeric data type
//        behind the scenes it is actually storing the integral value of the character
//        char will always be promoted to int if needed
        int i1 = c1;
        int i2 = c2; // implicit conversion cz int has 4-byte and char has 2-byte
        int i3 = c3;

        System.out.println(i1);
    }
}

