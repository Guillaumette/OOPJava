package org.example.Lection5.Ex003Math.Mathematics.Shapes;

public class Triangle extends Shape {
    private double side;
    private double height;

    public static Triangle create(double side, double height, String name) {
        // ???
        var instance = new Triangle();
        instance.name = name;

        instance.side = side;
        instance.height = height;
        return instance;
    }

    private Triangle() {
    }

    @Override
    public double getArea() {
        return (this.side * this.height) / 2.0;
    }

    @Override
    public String toString() {
        // ???
        return String.format("Name: %s side: %d height: %d", name, side, height);
    }
}
