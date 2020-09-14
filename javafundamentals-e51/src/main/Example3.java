package main;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Example3 {

  public static void main(String[] args) throws ExecutionException, InterruptedException {
    ExecutorService service =
      Executors.newFixedThreadPool(4);

    var c =
      new SummingNumbersCallable(3, 5);

    Future<Integer> f = service.submit(c);

    Integer sum = f.get();

    System.out.println(sum);
  }

}
