package example2;

import static example2.Main.bucket;

public class Consumer extends Thread {

    public Consumer(String name) {
        super(name);
    }

    @Override
    public void run() {

        while (true) {

            //  not synchronized
            // Tx
            // whatever threads are comming here cannot skip synchronized block
            // all threads will wait here till they got the lock
            synchronized (bucket) { // decide which is our monitor
                if (!bucket.isEmpty()) {
                    int n = bucket.get(0);
                    bucket.remove(0);
                    System.out.println(Thread.currentThread().getName()
                            + " took out the value " + n + " from the bucket.");
                }
            }

            //  not synchronized
        }

    }
}
