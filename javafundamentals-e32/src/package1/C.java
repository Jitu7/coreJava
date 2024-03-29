package package1;

/*
If you want a boundary for N
 */
public class C<N extends Number> {

    public void doSomeThing(N n) {
        // The Advantage of declaring a boundary is that now we can use methods of
        // Number class
        long l = n.longValue();
    }
}
