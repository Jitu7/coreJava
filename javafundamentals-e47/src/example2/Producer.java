package example2;

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

            synchronized (Main.bucket) {
                if (Main.bucket.size() < 100) { // T1
                    int n = random.nextInt(1000); // [0, 999]
                    Main.bucket.add(n);
                    System.out.println(Thread.currentThread().getName() +
                            " added value " + n + " to the bucket.");
                }
            }
        }
    }
}
