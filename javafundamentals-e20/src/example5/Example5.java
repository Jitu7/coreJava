package example5;

public class Example5 {

    public static void main(String[] args) {
//        Coffee c1 = Coffee.MEDIUM;
//        c1.setQuantity(10);
//        System.out.println(c1.getQuantity());
//
//        Coffee small = Coffee.SMALL;

        Coffee c1 = Coffee.MEDIUM;

        switch (c1) { // int, char, String, enum
            case SMALL:
                System.out.println(":)");
                break;
            case MEDIUM:
                System.out.println(":(");
                break;
        }

        /*
        by default each of the value in enum have
        a name and an ordinal

        Used in JPA Implementations / Hibernate
         */
        int ordinal = Coffee.SMALL.ordinal();
        String name = Coffee.SMALL.name(); // "SMALL"

        System.out.println(name + " " + ordinal);

        for (Coffee i : Coffee.values()) { // Coffee[]
            System.out.println(i.name());
        }
    }

}
