package main;

public class Example6 {

    public static void main(String[] args) {
        // ||   |   OR

        // || - Short circuit when the 1st expression is true it will not evaluate the 2nd

        // T   ||    T     T
        // T   ||    F     T
        // F   ||    T     T
        // F   ||    F     F

        boolean b1 = true;
        boolean b2 = false;

        boolean res1 = b1 || m(1);
        boolean res2 = b2 || m(2); // 2
        boolean res3 = b1 | m(3); // 3
        boolean res4 = b2 | m(4); // 4
    }

    private static boolean m(int i) {
        System.out.println(i);
        return true;
    }
}
