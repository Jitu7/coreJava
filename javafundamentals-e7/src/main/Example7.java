package main;

public class Example7 {

    public static void main(String[] args) {
        var x = 10;

//        for (; true; ) equivalent to this
        for (; ; ) {
            System.out.println(x);
            x--;

            if (x == 0) break;
        }

    }

}
