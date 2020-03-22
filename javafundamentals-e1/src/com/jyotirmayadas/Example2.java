package com.jyotirmayadas;

public class Example2 {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "Tom";
        cat.age = 3;
        cat.sayMeow();

        var cat1 = new Cat();
        cat1.name = "Leo";
        cat1.age = 5;
        cat1.sayMeow();
    }
}
