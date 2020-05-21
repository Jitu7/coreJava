package main;

public class Example2 {

    public static void main(String[] args) {
        // args is never null
        // in most of the cases an empty array -> length 0

        System.out.println(args.length);

        for (String s:
             args) {
            System.out.println(s);
        }
    }

}
