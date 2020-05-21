package main;

public class Example4 {

    public static void main(String[] args) {

//        int[][] a = {{1, 2, 3}, {2, 5}, {1}};
        int[][] a = new int[][]{{1, 2, 3}, {2, 5}, {1}};

        for (int[] x : a) {

            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();

        }
    }
}
