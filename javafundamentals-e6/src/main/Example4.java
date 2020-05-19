package main;

public class Example4 {

    public static void main(String[] args) {
        int x = 10;

        // x++ <=> x = x+1
        x = x++;

//        x = ++x; // 11

        System.out.println(x); // 10
    }
}
