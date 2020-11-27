package example2;

public class Example3 {

    // here the locks are different so m1() and m2() are not synchronized
    public static void main(String[] args) {

        A a = new A(); // not recommended
        A b = new A();

        Thread t1 = new Thread() {
            @Override
            public void run() {
                a.m1();
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                b.m2();
            }
        };

        t1.start();
        t2.start();
    }
}
