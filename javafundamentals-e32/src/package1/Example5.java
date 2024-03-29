package package1;

public class Example5 {

    public static void main(String[] args) {
        E<Integer, String> e1 = new E<>();
        E<Integer, String> e2 = new E<Integer, String>(); // recommended to use diamond operator

        E<?, String> e3 = new E<>();
        E<?, String> e5 = new E<>(); // In this case, not recommended to use diamond operator
        E<?, String> e4 = new E<Integer, String>(); // in case of wildcard don't use diamond operator wrt clean code pov


        E<Integer, ?> e6 = new E<>();
        E<?, ?> e7 = new E<>();

        E<?, ? extends Number> e8 = new E<String, Integer>();


    }
}
