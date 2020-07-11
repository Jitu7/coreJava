package example1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Example1 {

    /*
    if we work with lot of changes(add/remove) then its not recommended to use ArrayList
    Linked List is a good choice to implement Stack and Queue

    ArrayList --> most used and simple

    List(I) and its implementations are ordered(not sorted), indexed
    */
    public static void main(String[] args) {
        // ArrayList is just like an Array
        Integer[] i = new Integer[10];
        i[2] = 10;
        System.out.println(i[2]);

        List<Integer> list1 = new ArrayList<>(); // backed by array
        List<Integer> list2 = new LinkedList<>(); // Doubly list

        list1.add(10);
        list2.add(20);

        list1.get(0); // index

    }

}
