package com.jyotirmayadas;

public class Example2 {

    public static void main(String[] args) {
        Cat c1 = new Cat("Tom", 10);
        Cat c2 = new Cat("Tom", 10);

        boolean b1 = c1 == c2;
        boolean b2 = c1 == c2;

        System.out.println(b1);
        System.out.println(b2);

    }

}

class Cat {
    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
