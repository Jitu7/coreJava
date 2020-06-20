package example4;

public interface A {

    default void m1() {
        // do something here
        s1();
        //do something here
    }

    default void m2() {
        // do something here
        s1();
        //do something here
    }

    private static void s1() {
        System.out.println("A");
        System.out.println("B");
    }
}
