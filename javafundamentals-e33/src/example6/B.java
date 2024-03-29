package example6;

public class B <T> {
    T a;

    // Below T which is used in the method is not same as the one used in class,
    // so better to name that differently to avoid confusion
    static <T> void m() {

    }
}
