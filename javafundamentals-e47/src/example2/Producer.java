package example2;

import java.security.SecureRandom;
import java.util.stream.IntStream;

import static example2.Main.bucket;

public class Producer extends Thread {

    public Producer(String name) {
        super(name);
    }

    @Override
    public void run() {
        SecureRandom random = new SecureRandom();
        // 100
        while (true) {

            synchronized (bucket) {
                if (bucket.size() < 100) { // T1
                    int n = random.nextInt(1000); // [0, 999]
                    bucket.add(n);
                    System.out.println(Thread.currentThread().getName() +
                            " added value " + n + " to the bucket.");
                }
            }
        }
    }
}