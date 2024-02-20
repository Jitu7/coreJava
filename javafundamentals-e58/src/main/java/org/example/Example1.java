package org.example;

import java.util.NavigableSet;
import java.util.concurrent.*;

public class Example1 {

    public static void main(String[] args) {

        // We can use it in multithreading environment
        ConcurrentMap<Integer, String> m1 =
                new ConcurrentHashMap<>(); // simple implementation of synchronized hashmap

        // whenever there is a *SkipList* in the name, that kind of implementation shorts the value
        ConcurrentMap<Integer, String> m2 =
                new ConcurrentSkipListMap<>(); // equivalent to TreeMap

        ConcurrentNavigableMap<Integer, String> m3 = new ConcurrentSkipListMap<>();

        ConcurrentSkipListSet<Integer> s1 = new ConcurrentSkipListSet<>(); // equivalent to TreeSet

        NavigableSet<Integer> s2 = new ConcurrentSkipListSet<>(); // equivalent to TreeSet

    }
}
