package package1;

public class Example3 {

    public static void main(String[] args) {

        B<Integer> b = new B<>(10);
        System.out.println(b.b.getClass()); // class java.lang.Integer

        B<?> b2 = new B<>(10.5);
        System.out.println(b2.b.getClass()); // class java.lang.Double

        B<? extends Number> b3 = new B<>(10);
        System.out.println(b3.b.getClass()); // class java.lang.Integer

        B<? super Number> b4 = new B<>(10);
        System.out.println(b4.b.getClass()); // class java.lang.Integer


    }
}
