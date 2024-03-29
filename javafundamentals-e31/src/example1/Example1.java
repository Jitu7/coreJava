package example1;

public class Example1 {

    public static void main(String[] args) {
        Foo f1 = new Foo();
        f1.x = 5;

        Foo f2 = new Foo();
        f2.x = "Hello";

        int x = (int) f1.x; // This casting we want to avoid

        int y = (int) f2.x; // ClassCastException --> we want to catch this in compile time itself,
                            // Because of this reasons we use generics

    }


}
