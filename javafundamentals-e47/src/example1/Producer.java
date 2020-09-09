package example1;

import java.security.SecureRandom;

public class Producer extends Thread {

    public Producer(String name) {
        super(name);
    }

    @Override
    public void run() {
        SecureRandom random = new SecureRandom();
        // 100
        while (true) {
            if (example1.Main.bucket.size() < 100) {
                int n = random.nextInt(1000); // [0, 999]
                example1.Main.bucket.add(n);
                System.out.println(Thread.currentThread().getName() +
                        " added value " + n + " to the bucket.");
            }
        }
    }
}
