package example1;

public class Example1 {

    public static void main(String[] args) {

        /*
        Static Types
         */
        A1.A3 a3 = new A1.A3(); // treat A3 as class member of A1

        /*
        Non static ->
            Refer it from the instance of the outer class
         */
        A1 a1 = new A1();
        A1.A2 a2 = a1.new A2(); // two instances tightly coupled
                        // can't refer A2 with out instance of A1



    }

}
