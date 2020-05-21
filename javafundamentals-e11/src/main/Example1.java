package main;

public class Example1 {

    public static void main(String[] args) {
        m1();
        m1(1);
        m1(1, 2, 3, 4);
        System.out.println("******");
        m2("ABC");

        // ...
        int[] a = {1, 2, 3, 4};
        m1(a); // m1(1,2,3,4);

        // ...
        int[] b1 = {1, 2, 3, 4, 5};
        int[] b2 = {1, 2, 3, 4, 5};

        int[][] c = {b1, b2};
//        m3(b1, b2);
        m3(c);

    }

    static void m1(int... a) { // array with one dimension -> vector

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    // we can use only one var arg parameter in the method n it should be the last one
    static void m2(String x, int... y) {
        System.out.println(x);
        System.out.println(y.length);
    }

    static void m3(int[]... x) { // array of arrays -> matrix

    }

}
