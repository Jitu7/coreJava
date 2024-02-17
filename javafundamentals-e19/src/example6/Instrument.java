package example6;

@FunctionalInterface
public interface Instrument {

    void play();

    default void m() {

    }
}
