package main;

public class Example1 {

    public static void main(String[] args) {
        // ++ --

        var i = 10;

        System.out.println(i + 1); // 11
        System.out.println(i); // 10

//        i++; // i = i + 1
//        i--; // i = i - 1

        System.out.println(i++); // 10
        System.out.println(i); // 11

        System.out.println(++i); // 12

        System.out.println(m1(i++)); // 12

        System.out.println(i); // 13

        System.out.println(m1(++i)); // 14

    }

    private static int m1(int i) {
        System.out.println("inside method " + i);
        return i;
    }

}
