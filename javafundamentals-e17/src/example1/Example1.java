package example1;

public class Example1 {

    public static void main(String[] args) {

        A a1 = new B();
        B b1 = (B) a1; // only convert one type to other not the object

        a1.x = 10;
        b1.x = ":)";

        a1.m(); // B
        b1.m(); // B

        a1.m1(); // static A
        b1.m1(); // static B

//        double x = 10.5;
//        int y = (int) x;
//        x = y;
//        System.out.println(x); // 10.0
    }
}
