package example6;

public class A {

    // use generics types before return type
    <T> void m1() {

    }

    <T> T m2(T a) {
        return null; // can return null because we can only use Object types with generics
    }

    static <T> T m3(T a) {
        return a;
    }

    <T,G> T m4(G g) { // can use as much as generic types we want
        return null;
    }

    static <T> void someThing(T a, Class<T> c) {
        // does something, might have seen methods like this in framework
    }

    // by below method we avoid type casting
    static <T> T getBean(String name, Class<T> c) {
        return null;
    }

    // If we would not have the possibility to specify the type, means if we would not have generics
    static Object getBean(String name) {
        return null;
    }


    public static void main(String[] args) {
        someThing(10, Integer.class);

        Integer b1 = getBean("b1", Integer.class); // example of the one who is calling the method has to respect
                                                        // the relationship between the types.
        String b2 = getBean("b2", String.class);

        Integer b3 = (Integer) getBean("b1"); // this code is error-prone to classCastException at runtime,
                            // one of the main purpose of generics type is to avoid casting and conversion,
                        // and it moves the error to earlier like compile time

    }
}
