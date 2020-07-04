package example1;

public class Example1 {

    public static void main(String[] args) {
        var r1 = new OddNumbersRunnable(); // Task

        // put in a different thread
        var t1 = new Thread(r1, "T1"); // NEW
        var t2 = new Thread(r1, "T2"); // NEW

        t1.start(); // NEW -> RUNNABLE
        t2.start(); // NEW -> RUNNABLE

        System.out.println("END! " + Thread.currentThread().getName());
    }

}

