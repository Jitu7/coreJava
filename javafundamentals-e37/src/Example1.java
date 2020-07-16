import java.util.ArrayDeque;
import java.util.Deque;

public class Example1 {

    /*
    Deque can be used to implement Stacks and Queues
     */
    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>();
        var d2 = new ArrayDeque<>();

        // adding an element at the beginning
        // adding the element at the end also
        // retrieve/remove an element from the beginning
        // retrieve/remove an element at the end

        // stack ... LIFO
        // stacks have layers

        // deque
        // beginning 1 2 3 4 5 6 end

        d1.push(3); // d1.addFirst(3); (both are similar)
        d1.push(8);
        d1.push(9);

        // 9 8 3
        d1.forEach(System.out::println);

        Integer e1 = d1.pop();// d1.removeFirst(); (both are similar)

        d1.forEach(System.out::println);

        d2.addLast(10); // d2.offer(10); (Similar)
        d2.addLast(7);
        d2.addLast(8);

    }

}
