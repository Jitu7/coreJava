package org.example;

// By default, class and fields are final, cannot extend other class but can implement interface
public record Dog(String name, int age) implements Comparable<Dog> {
    @Override
    public int compareTo(Dog o) {
        return 0;
    }
}
