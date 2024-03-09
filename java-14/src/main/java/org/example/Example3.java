package org.example;

public class Example3 {

    /* Now we can use switch not only as a decision structure but as well as
     a terminal operator */

    public static void main(String[] args) {

        int x = 10;

        // If you want to use with ->
        int y = switch (x) {
            case 10, 20, 30 -> 100;
            default -> throw new IllegalArgumentException();
        };

        // If you want to use with :
        int z = switch (x) {
            case 10, 20, 30:
                yield 100;
            default:
                throw new IllegalArgumentException();
        };

    }
}
