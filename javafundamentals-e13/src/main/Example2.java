package main;

import static second.B.m;
import static second.B.x;

/*
    it's always
        import static - correct
        static import - incorrect
 */

public class Example2 {

    public static void main(String[] args) {
        x = 10;

        m();
    }
}
