package package1;

public class Example4 {
    public static void main(String[] args) {

//        package1.C<String> c = new package1.C<String>(); // CE
        C<Number> c1 = new C<>();
        C<Integer> c2 = new C<>();
        C<Double> c3 = new C<>();
    }
}
