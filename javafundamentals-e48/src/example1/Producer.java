package example2;

import java.security.SecureRandom;

import static example2.Main.bucket;

public class Producer extends Thread {

    public Producer(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            SecureRandom random = new SecureRandom();
            // 100
            while (true) {

                synchronized (bucket) {
                    if (bucket.size() < 100) { // T1
                        int n = random.nextInt(1000); // [0, 999]
                        bucket.add(n);
                        bucket.notifyAll(); // asks the consumer to continue
                        System.out.println(Thread.currentThread().getName() +
                                " added value " + n + " to the bucket.");
                    } else {
                        bucket.wait(); // producer waits now, i.e., put into BLOCKED state
                    }
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}