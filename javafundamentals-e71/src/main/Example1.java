package main;

import service.ProductService;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
Framework controls classes we write, This is even a principle.
We allow the framework to control our classes.

But how framework will know what will be class name we will give,
what constructor we will write, well this is where Reflection helps.

Reflection is a way in Java to control byte code(compiled code i.e. .class file). It can still manipulate .class file.
 */
public class Example1 {

    public static void main(String[] args) {
        String myClass = "service.ProductService";

        // Class -> Java also knows how to see Class as an Object
        // with the package name we can get the Class object

        // ClassNotFoundException -> it will occur when we try to access a class through reflection, which is
        // not in part of classpath.

        // Classpath -> it's the place where all the classes can be seen by running application. And if you don't have
        // the class in classpath, and you try to use it in your application directly, then we will get an error not
        // exception NoClassDefFoundError. It can happen when you forget to add any jar or remove it from classpath.
        // If you do that the code already compiled, so it can not be a compilation error anymore.


        try {
            Class productServiceClass = Class.forName(myClass);

            Constructor c = productServiceClass.getDeclaredConstructor();
            c.setAccessible(true); // we can bypass the access modifiers in most of the cases except modules(Java9 Project Jigsaw)

            Object o = c.newInstance();

            System.out.println(o);
            System.out.println(o.getClass());

            Method addProduct = productServiceClass.getMethod("addProduct");
            addProduct.invoke(o);

        } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException |
                 IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

}
