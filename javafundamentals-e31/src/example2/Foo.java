package example2;

/*
 Java assumes when creates instance, you will provide value for T;
 Here T is an instance member, not a static member.

 These generic types don't change the byte code, which means they are only a feature in
 source code itself. In the end, when byte code is generated from the source code by java
  compiler, it will be still
    Object x

 And we cannot use primitives for generics.
*/

public class Foo<T> {

    T x;

    public Foo() {

    }

    public Foo(T x) {
        this.x = x;
    }

    public void printX() {
        System.out.println(this.x);
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }
}
