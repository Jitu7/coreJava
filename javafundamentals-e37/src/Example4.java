import java.util.HashMap;

public class Example4 {

    public static void main(String[] args) {
        HashMap<Integer, String> m1 = new HashMap<>();

        // keys are unique
        m1.put(10, "ABC");
        m1.put(20, "QWE");
        m1.put(30, "WWW");
        m1.put(40, "ABC");

//        m1.forEach((k,v) -> System.out.println(k + " " + v));
        System.out.println(m1);
    }

}
