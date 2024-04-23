package example4;

/*
Local Type (Nested Type)
 */
public class B1 {

    static int x;

    void m1(int k) { // becoming final automatically
        // if we will use it as local inside local type here its B2

        int q = 20; // its becoming final automatically java 8 onwards
        // final int q = 20; // in java7 we have to use final keyword

//        q = 30; // if we want to use q as variable i.e. its value varies
                // and it is local to m1() then we can't use it inside m2()
        class B2 { // Local Class or Local Type
            void m2() {
                System.out.println(q);
                System.out.println(k);
            }
        }

    }

    static void m2() { // m2 called static context
        // you don't have access to this of B1 class

        // what ever we can access inside m2() same is applicable
        // inside B3

        int z = 10;

        class B3 {
            //            B1.x = 10; // CE
            void m3() {
                System.out.println(z);
            }
        }
    }

}
