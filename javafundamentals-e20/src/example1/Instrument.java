package example1;

@FunctionalInterface
public interface Instrument {

    void play();

    default void m() {
    }

    static void m1() {
    }

}
