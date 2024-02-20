package org.example;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Example5 {

  public static void main(String[] args) {
    Map<Integer, Integer> m1 = new HashMap<>();

    /*
    If from the beginning, you don't know your collection will be used by multithreading architecture,
    for that specific scenario use below one for that specific use case itself.
     */
    Map<Integer, Integer> sm1 = Collections.synchronizedMap(m1);


    /*
    If from the beginning you know your collection will be used on multiple threads, then go for ConcurrentHashMap
     */
    ConcurrentHashMap<Integer, Integer> m2 = new ConcurrentHashMap<>(); // Recommended to use
  }
}