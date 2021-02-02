package optional;

import java.util.Optional;

public class Example2 {

    public static void main(String[] args) {

        final Optional<Integer> o1 = Optional.empty(); // empty box
        final Optional<Integer> o2 = Optional.of(10); // 10 is inside the box

//        final Optional<Integer> o2 = Optional.of(null); // using null with of() throws an exception
//        final Optional<Integer> m = Optional.of(m()); // throws an exception whenever m() returns null

        final Optional<Integer> o3 = Optional.ofNullable(10); // Returns an Optional describing the given value,
                                                            // if non-null, otherwise returns an empty Optional.
        final Optional<Integer> o4 = Optional.ofNullable(m()); // creates an empty optional

        boolean b1 = o1.isPresent(); // false
        boolean b2 = o2.isPresent(); // true

        final Integer i1 = o2.get(); // make sure optional is not empty

        // so usually we do it inside an if block
        if (o2.isPresent()) {
            final Integer i2 = o2.get();
        }

    }

    static Integer m() {
        return null;
    }

}
