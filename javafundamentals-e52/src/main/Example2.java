package main;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Example2 {

  public static void main(String[] args) throws InterruptedException {

    ScheduledExecutorService es1 = Executors.newSingleThreadScheduledExecutor(); // one thread
//    ScheduledExecutorService es2 = Executors.newScheduledThreadPool(4);

    Runnable r1 = () -> System.out.println(":)");

    es1.schedule(r1, 7, TimeUnit.SECONDS);

    Thread.sleep(1000 * 10);

    es1.shutdown();

  }

}
