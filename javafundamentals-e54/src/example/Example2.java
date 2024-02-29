package example;

public class Example2 {
    int n;

    public synchronized void increment() {
        n++; // n = n+1
    }

    public synchronized int get() {
        return n;
    }
}
