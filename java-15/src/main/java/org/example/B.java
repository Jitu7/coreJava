package org.example;

/*
We have three options to declare Dog class
    final: If B is final no one can extend this
    sealed: If B is sealed again B needs to specify the permits
    non-sealed: If we dont want to make it final or sealed and allow other classes from this class
*/

/*public final class B extends A {
}*/

public sealed class B extends A permits C {

}
