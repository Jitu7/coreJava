import java.util.TreeMap;

public class Example6 {

    public static void main(String[] args) {
        var m1 = new TreeMap<Cat, String>();

        m1.put(new Cat(10), "Tom");
        m1.put(new Cat(20), "Leo");
        m1.put(new Cat(5), "Lee");
        m1.put(new Cat(30), "Jack");

        var m2 = new TreeMap<Cat, String>((c1, c2) -> c2.getAge() - c1.getAge());
        m2.put(new Cat(10), "Tom");
        m2.put(new Cat(20), "Leo");
        m2.put(new Cat(5), "Lee");
        m2.put(new Cat(30), "Jack");
    }

}
