package package2;

public class Example1 {

    public static void main(String[] args) {
        // What's the type of field 'a'?
        // Ans - Object
        B<Integer> b1 = new B<>();
        b1.a = "A";

        // What's the type of field 'a'?
        // Ans - Integer
        C<Integer> c1 = new C<>();
        c1.a = 10;

        // What's the type of field 'a'?
        // Ans - String
        D<String> d1 = new D<>();
        d1.a = "A";

        // What's the type of field 'a'?
        // Ans - Double
        E<Double> e1 = new E<>();
        e1.a = 10.5;

    }

}
