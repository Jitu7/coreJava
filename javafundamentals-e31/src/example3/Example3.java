package example3;

public class Example3 {

    /*
    Integer extends Number
    Double extends Number
     */
    public static void main(String[] args) {
        // Below are the things we can use left side(known as constraints),
        // i.e., declaration of a variable (local, instance, static, parameter,
        // return type of method) of type generic
        Foo<Integer> f1;
        Foo<?> f2; // any object wildcard
        Foo<? extends Number> f3;
        Foo<? super Number> f4;
        Foo<Number> f5;

        f1 = new Foo<Integer>();
//        f1 = new Foo<Double>(); // CE

        f5 = new Foo<Number>();
//        f5 = new Foo<Integer>(); // CE

        // If you want to use children as well, we have to use extends generic declaration
        // below we can use any children of Number
        // For clean code pov always go for a precise type if possible Foo<Integer> f1.
        // Always give the priority from most precise to the least precise
        f3 = new Foo<Number>();
        f3 = new Foo<Integer>();
        f3 = new Foo<Double>();
//        f3 = new Foo<String>(); // CE

        // If you want to use parent as well, we have to use super keyword
        f4 = new Foo<Number>();
        f4 = new Foo<Object>();
//        f4 = new Foo<Integer>(); // CE


        // ? any object wild card
        f2 = new Foo<String>();
        f2 = new Foo<Integer>();
        f2 = new Foo<Object>();

        // Foo<Object> vs. Foo<?> [? allows polymorphism]
        Foo<Object> f6 = new Foo<Object>();
//        Foo<Object> f7 = new Foo<Number>(); // CE

        Foo<?> f8 = new Foo<Object>();
        Foo<?> f9 = new Foo<Integer>();

        Foo<? extends Object> f10 = new Foo<Number>();

    }

    static Foo<?> m1() {
        return null;
    }

}
