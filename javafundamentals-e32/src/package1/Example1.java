package package1;

public class Example1 {

    public static void main(String[] args) {
        A<Integer> a1 = new A<Integer>();
        A<String> a2 = new A<String>();

        /*
        Java 7 diamond operator -> when java has a way to understand how to provide a type right side, you can avoid
        writing.
         */
        A<String> a3 = new A<>();

        A<Number> a4 = new A<Number>() {
          // class that extends package1.A
        };

        // Above diamond operator is changed in Java 9
        A<Number> a5 = new A<>() {
            // class that extends package1.A
        };

    }

}
