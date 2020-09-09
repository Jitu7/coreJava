// Program to demonstrate Dead Lock
package example2;

public class Example2 {

    private Object a = new Object();
    private Object b = new Object();

    public void m1() {
        // T3
        synchronized (a) {
            // T1
            synchronized (b) { // Dead Lock

            }
        }

    }

    public void m2() {

        synchronized (b) {
            // T2
            synchronized (a) {

            }
        }

    }
}
