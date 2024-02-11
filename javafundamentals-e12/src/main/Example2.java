package main;

public class Example2 {

    public static void main(String[] args) {
        /**
         *  Overloading
         *  Overriding
         */
        A a = new A();

        a.a(10);
//        a.a(null); // CE: Ambiguous method call. Both
        a.a((String) null);
        a.a((Cat) null);

        B b = new B();
        B b1 = new B(10);

    }
}
