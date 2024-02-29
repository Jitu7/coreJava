package example;

import java.util.concurrent.Semaphore;

public class Example1 {

    private Semaphore semaphore = new Semaphore(4);

    public static void main(String[] args) {

    }

    public void m()  {
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }
    }
}
