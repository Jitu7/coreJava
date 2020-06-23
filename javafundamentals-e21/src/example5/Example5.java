package example5;

public class Example5 {

    // Anonymous type does not need to be declared local
    /*
    Inner Type
     */
    Cat c1 = new Cat() {

    };

    public static void main(String[] args) {

        int x = 10; // automatically becomes final(from SE8>)
                // if we use local inside Local Type

        // Class declared local that extends Cat
        Cat c1 = new Cat() {
//            x = 20; // CE
            @Override
            public void sayMeow() {
                System.out.println("Meow! Meow! " + x);
            }
        };

        c1.sayMeow(); // Meow! Meow!

        Cat c2 = new Cat();
        System.out.println(c2.getClass());

        System.out.println(c1.getClass());
    }

}
