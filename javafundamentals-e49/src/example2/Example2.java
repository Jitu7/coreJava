package example2;

public class Example2 {

    // in this example m1() and m2() is synchronized cz the lock is same object
    public static void main(String[] args) {

        A a = new A(); // not recommended

        Thread t1 = new Thread() {
            @Override
            public void run() {
                a.m1();
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                a.m2();
            }
        };

        t1.start();
        t2.start();
    }

}
