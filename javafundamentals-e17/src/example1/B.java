package example1;

public class B extends A{

    String x;
    int y;

    @Override
    void m() {
        System.out.println("B");
    }

    static void m1() {
        System.out.println("static B");
    }

}
