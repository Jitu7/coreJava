package main;

public class EvenNumbersThread extends java.lang.Thread {

    @Override
    public void run() { // main method of a thread
        try {
            for (int i = 0; i <= 10; i = i + 2) {
                System.out.println(i + " " + Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    } // DEAD

}
