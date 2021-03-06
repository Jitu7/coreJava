package main;

import java.util.concurrent.Callable;

public class SummingNumbersCallable implements Callable<Integer> {

  private int x, y;

  public SummingNumbersCallable(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public Integer call() throws InterruptedException {
    Thread.sleep(3000);
    return this.x + this.y;
  }

}
