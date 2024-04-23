package main;

import annotations.Call;

import java.lang.annotation.Annotation;
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
public class Example2 {

    public static void main(String[] args) {
        String myClass = "service.ProductService";

        try {
            Class productServiceClass = Class.forName(myClass);

            Constructor c = productServiceClass.getDeclaredConstructor();
            c.setAccessible(true); // we can bypass the access modifiers in most of the cases except modules(Java9 Project Jigsaw)

            Object o = c.newInstance();

            Annotation addProduct = productServiceClass.getAnnotation(Call.class);

            Method[] methods = productServiceClass.getDeclaredMethods();
            for (Method method : methods) {
                if (method.isAnnotationPresent(Call.class)) {
                    method.invoke(o);
                }
            }

        } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException |
                 IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

}
