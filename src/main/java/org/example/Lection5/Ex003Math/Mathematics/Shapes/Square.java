package org.example.Lection5.Ex003Math.Mathematics.Shapes;

public class Square extends Shape {
    private double side;

    public static Square create(double side, String name) {
        var instance = new Square();
        instance.name = name;

        instance.side = side;
        return instance;
    }

    private Square() {
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public String toString() {
        // ???
        return String.format("Name: %s side: %d", name, side);
    }
}
