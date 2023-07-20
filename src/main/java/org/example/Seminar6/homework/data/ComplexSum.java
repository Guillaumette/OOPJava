package org.example.Seminar6.homework.data;

public class ComplexSum implements Operations {
    public Complex getExecution(Complex a, Complex b) {
        double real = a.re() + b.im();
        double img = a.im() + b.im();
        return new Complex(real, img);
    }
}
