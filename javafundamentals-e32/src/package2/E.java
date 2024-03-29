package package2;

/*
We can forward G from E -> A
Type G is a declaration for E class,
while for A, G is a known type, and it's basically an effective type.
Just that it is considered that you know G when you create the instance of G.
 */
public class E<G> extends A<G> {
}
