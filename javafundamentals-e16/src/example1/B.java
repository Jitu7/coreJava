package example1;

public class B extends A {

    public B() {
        super(5);
        System.out.println("B");
    }

    public B(int x) {
//        super(x);
        this();
        System.out.println("B'");
    }
}
