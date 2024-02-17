package example3;

public class Circle extends Shape {

    double radius;

    public double area() { // implements method in Shape
        return Math.PI * radius * radius;
    }
}
