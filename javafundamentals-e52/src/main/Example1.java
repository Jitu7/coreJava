package main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example1 {

  public static void main(String[] args) {
    // Runtime.getRuntime().availableProcessors();
    ExecutorService es1 = Executors.newFixedThreadPool(4);

    ExecutorService es2 = Executors.newSingleThreadExecutor(); // equivalent to fixed thread pool with one thread

    ExecutorService es3 = Executors.newCachedThreadPool(); // creates threads while they are needed,
                                                        // it keeps the thread inside the thread pool for 60s
                                                       // after that it discards the threads if it is not used anymore.
    // newest implementation added in Java 8
    ExecutorService es4 = Executors.newWorkStealingPool();
  }

}
