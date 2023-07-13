package org.example.Seminar5.Homework.data.operationComplex;

import org.example.Seminar5.Homework.data.Complex;

public class ComplexDiv {
    public Complex div(Complex a, Complex b) {
        double real = (a.getRe() * b.getRe() + a.getIm() + b.getIm()) / (a.getRe() * a.getRe() + a.getIm() + a.getIm());
        double img = (b.getIm() * a.getRe() - b.getRe() * a.getIm()) / (a.getRe() * a.getRe() + a.getIm() + a.getIm());
        return new Complex(real, img);
    }
}
