package example1;

public abstract class Pet {

    protected String name; // protected because can only be inherited by the child classes

    public Pet(String name) {
        this.name = name;
    }
}
