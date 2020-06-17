package example2;

public class B extends A {

    // Co-variant
    Integer m() { // Integer -> Number
        return 5;
    }
}
