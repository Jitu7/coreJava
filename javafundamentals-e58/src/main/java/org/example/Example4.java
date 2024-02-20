package org.example;

import java.util.concurrent.*;

public class Example4 {

    /*
    The important capability it comes with is; it allows you on the operation to also specify the timeout
    Recommended to use this instead of ConcurrentLinkedQueue, ConcurrentLinkedDeque

    Because it's always better to avoid your application getting stuck.
    We use a principle named Fail Fast.
     */

    public static void main(String[] args) throws InterruptedException {
        BlockingDeque<Integer> d1 = new LinkedBlockingDeque<>();

        BlockingQueue<Object> q1 = new LinkedBlockingQueue<>();

        d1.offerFirst(4,1, TimeUnit.SECONDS); // by adding timeout, we avoid deadlocks

    }

}
