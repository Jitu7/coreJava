package example4;

public class Example4 {

    /*
       StringBuffer ---> behaves synchronized way
       StringBuilder ---> non synchronized way

       Except this they are very similar
       these two are non immutable type of string
     */
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= 1000; i++) {
            sb.append(i);
        }

        // HERE 1001

    }

}
