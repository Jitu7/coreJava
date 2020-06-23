package example2;

import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // console input stream

        System.out.println("Name:");
        String name = sc.nextLine();

        System.out.println("Hello, " + name + "!");
    }

}
