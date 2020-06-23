package example1;

public class A1 { // outer

    int x; // this -> represents current instance of the class
    int z;

    private String privateFieldOfA1;

    private static int p;

    /*
    Member of class so all Access Modifiers applicable
    public
    protected
    default
    private
     */
    class A2 /* extends A1 */ { // inner

        int y;
        String z;

        void m() {
//            this.x = 10 // CE here this refers to A2
            this.y = 20;
            x = 10; // A1.this / A1.super
            A1.this.x = 20;
            z = "10"; // by default searching for the closer one

            privateFieldOfA1 = "Accessible inside Inner Class";
        }

    }

    static class A3 {
        /*
        As it is static A1.this is not accessible here
         */
        void m() {
            p = 10; // A1.p = 10
        }

    }
}
