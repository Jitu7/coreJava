package main;

public class Example5 {

    public static void main(String[] args) {

        // int[][] x = {null, null, null};
        int[][] x = new int[3][];

        x[0] = new int[]{1};
        x[1] = new int[]{2, 3, 4};
        x[2] = new int[]{10};

        int[][] y = new int[3][2];
        // {{0,0}, {0,0}, {0,0}}

        for (int[] z : y) {
            for (int n : z) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
