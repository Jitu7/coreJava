import java.util.TreeMap;

public class Example6 {

    public static void main(String[] args) {
        var m1 = new TreeMap<Cat, String>();

        m1.put(new Cat(10), "Tom");
        m1.put(new Cat(20), "Leo");
        m1.put(new Cat(5), "Lee");
        m1.put(new Cat(30), "Jack");

    }

}
