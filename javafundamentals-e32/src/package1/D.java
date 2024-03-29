package package1;

/*
    We can declare any no of generic types.
    And each of them has its boundaries or not
    We can define boundary for both of them, or only one of them
    And can give different boundaries also.

    And if you remember, we cannot extend String class because it is final,
    But what's funny is still below syntax works. Not recommended for clean code
    pov though.
 */
public class D<X extends Number, Y extends String> {
}
