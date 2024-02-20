package org.example;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class Example3 {

    /*

    These implementations do not apply the concurrency on the operations themselves, they do not synchronize the operation.
    They work by creating for any operation that is a change in collection, they create a new instance.
    So that creation of the new instance is synchronized. And then when you work with adding values or removing values
    or changing references inside a collection. You work on a copy of that collection.

    So any kind of mutating operation on this kind of collection creates a new instance of the collection which copies all
    the values again.

    For any mutating operation (add, change reference in a collection, remove), it will create a new instance of that
    collection copy all the values and then do the operation on the copy of the collection.

    But careful with this kind of collection, if you have a lot of mutating operations, this might fill up your memory fast.
    And we may get Out of memory error.

    By this it solves concurrency.
    Use it only when you have many more read operations than write operations.
    That's because if you have more-read operations mainly, it will act as a non-synchronized collection.

     */

    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

        CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<>();
    }
}
