package org.example.Seminar7.homework.controllers;


import org.example.Seminar7.homework.data.Complex;
import org.example.Seminar7.homework.data.ComplexCalc;
import org.example.Seminar7.homework.model.ComplexModel;

public class ControllerVersion implements Controller {

    public ControllerVersion() {
    }

    public Complex sendComplex(ComplexCalc calc) {
        ComplexModel model = new ComplexModel();
        return model.calculate(calc);
    }
}
