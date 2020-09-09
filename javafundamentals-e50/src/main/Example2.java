package main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Example2 {
  private static final int noOfCores = Runtime.getRuntime().availableProcessors();

  public static void main(String[] args) {
    // Executor(I) <- ExecutorService(I)

    ExecutorService service = null;
    try {
      service = Executors.newFixedThreadPool(noOfCores); // threads

      Runnable runnable = () -> System.out.println(":) " +
        Thread.currentThread().getName()); // ball

      Future<?> f = service.submit(runnable); // throwing the ball into the pool

      System.out.println(":( " + Thread.currentThread().getName());

    } finally {
      if (service != null) {
        service.shutdown(); // will not close the pool until all the tasks in the pool finishes
//      service.shutdownNow(); // not recommended
      }
    }
  }
}
