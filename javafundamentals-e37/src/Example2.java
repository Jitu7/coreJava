import java.util.ArrayDeque;

public class Example2 {

    /*
    Deque can be used to implement Stacks and Queues
     */
    public static void main(String[] args) {
        // Deque -> stack -> LIFO
        // Deque -> queue -> FIFO

        var deque = new ArrayDeque<>(); // like ArrayList, ArrayDeque is also backed by an array

        // queue
        deque.offer(10);
        deque.offer(20);
        deque.offer(30);

        // 10, 20, 30
        deque.forEach(System.out::println);

        deque.pop();

        // 20, 30
        System.out.println(deque);

    }

}
