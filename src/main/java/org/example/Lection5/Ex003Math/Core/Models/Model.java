package org.example.Lection5.Ex003Math.Core.Models;

import org.example.Lection5.Ex003Math.Mathematics.CalculateArea.ICalculate;
import org.example.Lection5.Ex003Math.Mathematics.Shapes.Canvas;
import org.example.Lection5.Ex003Math.Mathematics.Shapes.Shape;

public class Model {
    Shape panel;
    ICalculate calc;

    public Model(ICalculate c, String canvasName) {
        panel = new Canvas(canvasName); // "Буз имени (2).jpg
        calc = c;
    }

    public void append(Shape shape) {
        panel.shapes.add(shape);
    }

    public double area() {
        return calc.visit(panel);
    }

    public String show() {
        return panel.toString();
    }
}
