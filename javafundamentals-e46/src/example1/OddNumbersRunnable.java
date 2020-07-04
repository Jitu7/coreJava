package example1;

import java.util.stream.IntStream;

public class OddNumbersRunnable implements Runnable {

    // Task
    @Override
    public void run() {
        IntStream.range(0, 11)
                .filter(value -> value %2 == 0)
                .forEach(value -> System.out.println(value + " "
                        + Thread.currentThread().getName()));
    }

}
