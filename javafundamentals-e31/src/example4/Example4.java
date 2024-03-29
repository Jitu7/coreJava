package example4;

public class Example4 {
    public static void main(String[] args) {
        Foo<Integer> f1 = new Foo<Integer>();
        f1.x = 10;
        f1.x = 30;

        Foo<? extends Number> f2 = new Foo<Integer>();
//        f2.x = 10; // CE

        Foo<? super Number> f3 = new Foo<Number>();
        f3.x = 10;
        f3.x = 40;

        Foo<? super Number> f4 = new Foo<Object>();
        f3.x = 10;
        f3.x = 40;

        Foo<? super Integer> f5 = new Foo<Object>();
        f5.x = 10;

    }
}
