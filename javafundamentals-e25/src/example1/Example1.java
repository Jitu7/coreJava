package example1;

public class Example1 {

    /*
        GC -> it's the only mechanism that de-allocates memory in java
     */
    /*
    STACK MEMORY ---> StackOverFlowError
    There is always a single stack per each thread.
    We might have two different stacks for two different threads.
    In case of stack the de-allocation happens automatically
    when the level of stack on which variables were allocated is destroyed.
     */

    /*
    HEAP MEMORY ---> OutOFMemoryError
    Eden space, s0, s1, Old Generation, Permanent Generation
     */
    public static void main(String[] args) {
        int x = 10;
        m1();
    }

    static void m1() {
        int y = 10;
        m2();
    }

    static void m2() {
        int x = 10;
        m3();
    }

    static void m3() {
        new RuntimeException().printStackTrace();
    }
}
