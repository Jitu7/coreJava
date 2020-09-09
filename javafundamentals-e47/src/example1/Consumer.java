package example1;

public class Consumer extends Thread {

  public Consumer(String name) {
    super(name);
  }

  @Override
  public void run() {
    while (true) { //  C1 [10]    C2 [10]

      if (!example1.Main.bucket.isEmpty()) { //  C1 [10]    C2 [10]
        int n = example1.Main.bucket.get(0); // C1 [10]   -->  C1 (Runnable)
        example1.Main.bucket.remove(0); // C2 []     -->  C2 (Runnable) and put C1 into Running
        System.out.println(Thread.currentThread().getName()
          + " took out the value " + n + " from the bucket.");
      }

    }
  }
}
