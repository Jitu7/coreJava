package example2;

import java.util.Arrays;
import java.util.List;

public class Example2 {

    public static void main(String[] args) {

        var words = List.of("a4bkl8a", "fjksj80ekljglk", "daj4a3dd0");

        String digits = "0123456789";

        long count = words.stream()
                .flatMap(s -> Arrays.stream(s.split("")))
                .filter(s -> digits.contains(s))
                .count();

        System.out.println(count);
    }

}
