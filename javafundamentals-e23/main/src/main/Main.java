package main;

import hello.HelloWorld;

import java.util.ServiceLoader;

public class Main {

    public static void main(String[] args) {
        /*try {
            Class<?> c = Class.forName("example.Example");
            Constructor<?> constructor = c.getDeclaredConstructor();
            Object o = constructor.newInstance();
            System.out.println(o);
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        ServiceLoader<HelloWorld> loader = ServiceLoader.load(HelloWorld.class);
        // searches for HelloWorld implementations in module path
        loader.stream() // with all implementations found in module path
                .forEach(helloWorldProvider -> System.out.println(helloWorldProvider.get().sayHello()));
        // for each of the implementations we call the sayHello() method

    }

}
