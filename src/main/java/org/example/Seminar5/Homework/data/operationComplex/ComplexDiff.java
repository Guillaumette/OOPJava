package org.example.Seminar5.Homework.data.operationComplex;

import org.example.Seminar5.Homework.data.Complex;
import org.example.Seminar5.Homework.data.calculator.ComplexCalc;

public class ComplexDiff {
    public Complex diff(Complex a, Complex b) {
        double real = a.getRe() - b.getRe();
        double img = a.getIm() - b.getIm();
        return new Complex(real, img);
    }
}
