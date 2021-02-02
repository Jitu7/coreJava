package optional;

import java.util.Optional;

public class Example1 {

    public static void main(String[] args) {

        String s1 = null;

        final int length = s1.length(); // NullPointerException
    }

    static Optional<String> m1() {
        // more complex code
        return Optional.empty(); // empty box
    }

}
