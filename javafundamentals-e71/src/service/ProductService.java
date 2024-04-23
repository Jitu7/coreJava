package service;

import annotations.Call;

public class ProductService {

    private int x;

    private ProductService() {

    }

    public void addProduct() {
        System.out.println("Add product");
    }

    @Call
    public void updateProduct() {
        System.out.println("Updadte product");
    }

    public void printX() {
        System.out.println("Value of X: " + x);
    }
}
