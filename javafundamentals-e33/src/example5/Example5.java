package example5;

public class Example5 {

    public static void main(String[] args) {

        C<Integer> c1 = new C<>();
        C<String> c2 = new C<>();

        Integer i = c1.m1();
        c1.m2(10);

        String s = c2.m1();
        c2.m2(":)");
    }
}
