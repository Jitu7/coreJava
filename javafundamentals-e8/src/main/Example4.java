package main;

public class Example4 {

    public static void main(String[] args) {
        Cat c1 = new Cat();
        Cat c2 = new Cat();

        c1.name = "Leo";
        c2.name = "Tom";

        System.out.println(c1.name);
        System.out.println(c2.name);

        c1.name = "Litzy";
        System.out.println(c1.name);
    }
}
