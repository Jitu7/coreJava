package org.example;

import java.util.Deque;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Example2 {

    public static void main(String[] args) {

        Queue<Integer> q = new ConcurrentLinkedQueue<>();

        Deque<Integer> d = new ConcurrentLinkedDeque<>();

    }

}
