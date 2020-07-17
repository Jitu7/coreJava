package example3;

import java.security.SecureRandom;
import java.util.function.Supplier;

/*
Supplier -> doesn't take anything only returns one value, method also....can be anything
 */
public class Example3 {

    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        Supplier<Integer> s1 = () -> random.nextInt(100);
        Integer x = s1.get();

        System.out.println(x);

        Supplier s2 = () -> add();
        System.out.println(s2.get());
    }

    public static int add() {
        return 10 + 10;
    }
}
