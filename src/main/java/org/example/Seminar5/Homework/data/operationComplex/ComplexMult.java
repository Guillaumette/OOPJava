package org.example.Seminar5.Homework.data.operationComplex;

import org.example.Seminar5.Homework.data.Complex;

public class ComplexMult {
    public Complex multi(Complex a, Complex b) {
        double real = a.getRe() * b.getRe() - a.getIm() * b.getIm();
        double img = a.getRe() * b.getIm() + a.getIm() * b.getRe();
        return new Complex(real, img);
    }
}
