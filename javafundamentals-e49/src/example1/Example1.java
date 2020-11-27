package example1;

/*
Race Condition -> when multiple threads tries to access and change one resource
Dead Lock -> two or more threads waits after another, cz of our wrong logic
 */
public class Example1 {

  private Object monitor = new Object();

  public void a() {
    synchronized (monitor) {

    }
  }

  public void b() {
    synchronized (this) {

    }
  }

  /*
  here 'this' will always refer instance of the class,
  somewhat similar to b()
   */
  public synchronized /*this*/ void c() {

  }

  public static synchronized /*Example1.class*/ void d() {

  }

  /*
  When the ClassLoader in Java which is the mechanism of JVM (managing the classes), when its loading the blue print
  itself of the class, it actually creates an instance that refers to the blueprint itself.
  we only have one instance of such class per ClassLoader
   */
  public static void e() {
    synchronized (Example1.class) {

    }
  }

}
