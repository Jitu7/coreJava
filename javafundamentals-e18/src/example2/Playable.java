package example2;

/*
    Upto Java SE7
 */
public interface Playable {

    int x = 10; // public static final

    void play(); // public abstract

    default void m() {
        System.out.println(":)");
    }

    static void w() {
        System.out.println(":|");
    }
}
