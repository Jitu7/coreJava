package example;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Example3 {
    int n;
    ReadWriteLock lock = new ReentrantReadWriteLock();

    public synchronized void increment() {
        try {
            lock.writeLock().lock();
            n++; // n = n+1
        } finally {
            lock.writeLock().unlock();
        }
    }

    public synchronized int get() {
        try {
            lock.readLock().lock();
            return n;
        } finally {
            lock.readLock().unlock();
        }
    }
}
