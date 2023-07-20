package org.example.Seminar7.homework.data;

public class ComplexMult implements Operations {
    public Complex getExecution(Complex a, Complex b) {
        double real = a.re() * b.re() - a.im() * b.im();
        double img = a.re() * b.im() + a.im() * b.re();
        return new Complex(real, img);
    }
}
