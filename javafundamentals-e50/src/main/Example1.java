package main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example1 {
  private static final int noOfCores = Runtime.getRuntime().availableProcessors();

  public static void main(String[] args) {
    // Executor(I) <- ExecutorService(I)

    ExecutorService service = null;
    try {
      service = Executors.newFixedThreadPool(noOfCores); // threads

      Runnable runnable = () -> System.out.println(":) " +
        Thread.currentThread().getName()); // ball

      service.execute(runnable); // throwing ball into the pool

      System.out.println(":( " + Thread.currentThread().getName());

    } finally {
      if (service != null) {
        service.shutdown(); // will not close the pool until all the tasks in the pool finishes
//      service.shutdownNow(); // not recommended
      }
    }
  }
}
