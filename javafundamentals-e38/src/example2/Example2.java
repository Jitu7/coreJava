package example2;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Example2 {

    /*
    Consumers are objects themselves.
    So yes, you can pass them as parameters to methods as well.

    One easy thing you could try is

    Consumer<String> c = x -> System.out.println(x);

    same can also be written as:

    Consumer<String> c = System.out::println
     */
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 20, 30);
//        list.forEach(integer -> System.out.println(integer));

        // Consumer
        Consumer<Integer> c1 = x -> System.out.println(x);
        list.forEach(c1);

        // BiConsumer
        Map<Integer, String> map = Map.of(
                10, "A",
                20, "B",
                30, "C"
        );
        BiConsumer<Integer, String> biConsumer =
                (k, v) -> System.out.println(k + " - " + v);
        map.forEach(biConsumer);
    }

}
