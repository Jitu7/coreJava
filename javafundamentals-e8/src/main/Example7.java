package main;

public class Example7 {

    public static void main(String[] args) {
        Foo f1 = new Foo();
        Foo f2 = new Foo();

        f1.x = 10;
        f2.x = 20;

        System.out.println(f1.x);
        System.out.println(f2.x);

        Foo.y = 10;
        f1.y = 20; // Foo.y

        System.out.println(Foo.y);
    }

}
