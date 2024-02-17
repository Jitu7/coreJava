package example2;

public class Example2 {

    public static void main(String[] args) {

        /*
        left side should be more GENERAL and right side more PARTICULAR
         */
        Animal a1 = new Cat();
        Animal a2 = new Dog();

        Cat c1 = new Cat();
        Animal a3 = c1;

        Animal a4 = new ChildCat();

        /*
        left side should be more PARTICULAR and right side more GENERAL
        Then we require casting
         */
        Cat c2 = (Cat) a3;
        Cat c3 = (Cat) a4;
//        Cat c4 = (Cat) a2; // ClassCastException Runtime Exception

        // Compiler already knew about out Inheritance
        // Cat is-An Animal
        // Dog is-An Animal
//        Cat c5 = (Cat) new Dog(); // Compile time Error
//        Dog d1 = (Dog) c1; // Compile time Error


    }
}
