package example2;

public class Example2 {

    public static void main(String[] args) {

        // This will still work due to backward compatibility
        Foo foo = new Foo();
        foo.x = 10;

        Foo<Integer> f1 = new Foo<Integer>();
        f1.x = 5;

        Foo<String> f2 = new Foo<>(); // <> known as diamond operator
        f2.x = "Hello";

        // ----

        int x = f1.x;

        String s = f2.x;

//        int y = (int) f2.x; Compile time error



    }
}
