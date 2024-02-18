package example8;

import java.util.ArrayList;
import java.util.List;

public class Example8 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(34);
        list.add(1);
        list.add(20);
        list.add(20);

//        list.remove(10); // IndexOutOfBoundException

        list.remove(3); // remove number at index 3
        list.remove((Integer) 20); // remove(Object obj) removes 1st occurrence of 20
    }

}
