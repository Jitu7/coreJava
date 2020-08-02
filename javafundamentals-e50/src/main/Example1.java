package main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example1 {

    public static void main(String[] args) {
        // Executor <- ExecutorService

        ExecutorService service = null;
        try {
            int noOfCores = Runtime.getRuntime().availableProcessors();

            Executors.newFixedThreadPool(noOfCores);

            service.execute(() -> System.out.println(":) " + Thread.currentThread().getName()));

            System.out.println(":( " + Thread.currentThread().getName());

        } finally {
            if (service != null) {
                service.shutdown(); // will not close the pool until all the tasks in the pool finishes
//                service.shutdownNow(); // not recommended
            }
        }
    }
}
