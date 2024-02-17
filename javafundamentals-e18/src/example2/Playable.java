package example2;

/*
    Upto Java SE7
 */
public interface Playable { // abstract

    int x = 10; // public static final

    void play(); // public abstract

    default void m() {
        System.out.println(":)");
    } // Java 8

    static void w() { // Java 8
        System.out.println(":|");
    }

    private static void x() { // Java 9
        System.out.println(":|");
    }

}
