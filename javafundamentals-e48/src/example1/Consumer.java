package example2;

import static example2.Main.bucket;

public class Consumer extends Thread {

    public Consumer(String name) {
        super(name);
    }

    @Override
    public void run() {

        try {
            while (true) {

                synchronized (bucket) { // decide which is our monitor
                    if (!bucket.isEmpty()) {
                        int n = bucket.get(0);
                        bucket.remove(0);
                        bucket.notifyAll(); // asks the producer to continue
                        System.out.println(Thread.currentThread().getName()
                                + " took out the value " + n + " from the bucket.");
                    } else {
                        bucket.wait(); // consumer waits now, i.e., put into BLOCKED state
                    }
                }

                //  not synchronized
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
