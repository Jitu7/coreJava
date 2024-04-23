package main;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Example3 {

    public static void main(String[] args) {
        String myClass = "service.ProductService";

        try {
            Class productServiceClass = Class.forName(myClass);

            Constructor c = productServiceClass.getDeclaredConstructor();
            c.setAccessible(true); // we can bypass the access modifiers in most of the cases except modules(Java9 Project Jigsaw)

            Object o = c.newInstance();

            Field x = productServiceClass.getDeclaredField("x");
            x.setAccessible(true);
            x.setInt(o, 100);

            Method getX = productServiceClass.getDeclaredMethod("printX");
            getX.invoke(o);

        } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException |
                 IllegalAccessException | NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

}
