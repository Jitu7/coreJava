package example3;

public class Example3 {

    public static void main(String[] args) {

        String s1 = "hello";
        String s2 = "world";

        s1.concat(s2); // s1 is not changed

        System.out.println(s1); // hello

        s1 = s1.concat(s2);

        System.out.println(s1); // helloworld

        String s3 = ""; // both isBlank() and isEmpty() is true
        String s4 = "     "; // isBlank() is true but isEmpty() false

        String s5 = "Hello World";
        String s6 = s5.substring(3, 6);
        System.out.println(s6);

    }

}
