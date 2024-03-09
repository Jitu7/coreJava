package org.example;

public class Example4 {

    /*
    TEXT Block
     */
    public static void main(String[] args) {
        String s1 = """
                :)
                    :(
                :|
                """;
        System.out.println(s1);

        // Observer the indentation in output
        String s2 = """
                :)
                    :(
                :|
        """;
        System.out.println(s2);
    }
}
