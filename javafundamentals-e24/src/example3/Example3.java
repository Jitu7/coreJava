package example3;

import java.io.Console;

public class Example3 {

    public static void main(String[] args) {
        Console c = System.console();

        if (c != null) {
            char[] pass = c.readPassword();
        } else { // if we didn't call it directly from console
                // c is null
                // in case if we running it from IDE its null
            System.out.println("c is null");
        }

    }

}
