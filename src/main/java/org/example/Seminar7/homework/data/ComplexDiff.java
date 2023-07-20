package org.example.Seminar7.homework.data;

public class ComplexDiff implements Operations {

    public Complex getExecution(Complex a, Complex b) {
        double real = a.re() - b.re();
        double img = a.im() - b.im();
        return new Complex(real, img);
    }
}
