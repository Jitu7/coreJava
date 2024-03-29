package example1;

public class Example1 {
    public static void main(String[] args) {
        B b1 = new B();
        b1.a = "A";

        D<String> d1 = new D<>();
        d1.a = "B";

        D<Integer> d2 = new D<>();
        d2.a = 12;
    }
}
