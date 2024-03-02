package example;

public class Example2 {
    int n;

    public synchronized void increment() { // y = 1
        n++; // n = n+1
    }

    public synchronized int get() { // x = 1000   x/y = 1000
        return n;
    }
}
