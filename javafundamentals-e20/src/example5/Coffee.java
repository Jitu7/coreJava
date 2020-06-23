package example5;

public enum Coffee {

    SMALL(10), MEDIUM, BIG("Coffee"); // This is always 1st instruction
    //0                 1       2

    private int quantity;

    /*
        by default constructors are private
        we can't make it any other than private
     */
    Coffee() {
        System.out.println(":)");
    }

    Coffee(int quantity) {
        this.quantity = quantity;
    }

    Coffee(String message) {
        this(10);
        System.out.println(message);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

/*
    public final class Coffee {

        private static final Coffee SMALL = new Coffee();
        private static final Coffee MEDIUM = new Coffee();
        private static final Coffee BIG = new Coffee();

        private Coffee() {
        }

    }
 */