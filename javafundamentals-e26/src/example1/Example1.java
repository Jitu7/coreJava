package example1;

public class Example1 {

    public static void main(String[] args) {
        /*
        String POOL
         */
        String s1 = "HELLO"; // immutable -> can't change the instance once it created
//        s1 = "WORLD";

        String s2 = "HELLO";

        String s3 = new String("HELLO"); // Object is not created in String POOL

        String s4 = "HE" + "LLO"; // created inside String POOL

        String s5 = "HE".concat("LLO"); // created inside MEMORY

        String s6 = "HE";
        String s7 = "LLO";

        String s8 = s6.concat(s7); // created inside MEMORY
        String s9 = s6 + s7; // if either one is variable then it is
                        // created inside MEMORY

        /*
         == operator in case of object compares the address
         i.e stored inside the variable.

         In case of object use equals() to content comparision
         in terms of Letters
         */
        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false

        System.out.println(s1.equals(s3)); // true
        System.out.println(s1.equalsIgnoreCase("hello")); // true

        System.out.println(s1 == s4); // true
        System.out.println(s1 == s5); // false

        System.out.println(s1 == s8); // false
        System.out.println(s1 == s9); // false

    }

}
