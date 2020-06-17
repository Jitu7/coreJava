package example3;

public class B extends A {

    // not overriding
    void m() {
        System.out.println("B");
    }

    /*
        we can use more public while overriding
        public
        protected
        default
        private
     */
    /*
    private void m2() { //CE
        System.out.println("m2 overridden");
    }
    */
}
