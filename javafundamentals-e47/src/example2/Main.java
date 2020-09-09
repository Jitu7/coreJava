package example2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Integer> bucket = new ArrayList<>();

    public static void main(String[] args) {
        Producer p1 = new Producer("P1");
        Producer p2 = new Producer("P2");

        Consumer c1 = new Consumer("C1");
        Consumer c2 = new Consumer("C2");

        p1.start();
        p2.start();
        c1.start();
        c2.start();
    }

}
