package main;

public class Cat {

    // initialization of the variable done before the execution
    // of the static block
//    static String x = ":)";
    final static String x;

    final String name;

    /*
        When the class loaded for the 1st time into memory
        all the static blocks executed in
        the order the way it is declared
     */
    static {
        x = ":)";
        System.out.println(x);
    }

    // 1st anonymous block after that constructor
    {
        name = "Mitzy";
        System.out.println("A");
    }

    Cat() {
        System.out.println("A cat was created");
    }


    static {
        System.out.println("B");
    }

    static void sayMeow() {
        System.out.println("Meow!");
    }
}
