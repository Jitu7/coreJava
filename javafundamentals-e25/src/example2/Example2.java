package example2;

public class Example2 {

    public static void main(String[] args) {
        Cat c1 = new Cat();
        // 2bytes
        Cat c2 = c1;
        c1 = null;
//        c2 = new Cat();

        System.gc(); // Garbage Collector
    }
}
