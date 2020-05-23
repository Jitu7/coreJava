package second;

public class B {

    /*
        default access mode -> package mode
        public -> every where (from java 9 onwards little change wrt module)
        private -> inside class only
        protected -> same as default + sometimes outside from package(kid)

        public > protected > default > private
     */
    public static int x;

    public static void m() {
//        private int x; // CE can't be private inside local
    }
}
