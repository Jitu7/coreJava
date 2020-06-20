package example1;

public class Cat extends Pet {

    public Cat(String name) {
        super(name);

        // after
    }

    public void sayMeow() {
        System.out.println("Meow! My name " + this.name);
    }

}
