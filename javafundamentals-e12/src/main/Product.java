package main;

public class Product {

    String name;
    double price;

    public Product(String name) {
        this.name = name;
    }

    public Product(double price) {
        this.price = price;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
