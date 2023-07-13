package org.example.Seminar5.Homework.controllers;

import org.example.Seminar5.Homework.data.Complex;
import org.example.Seminar5.Homework.data.calculator.ComplexCalc;
import org.example.Seminar5.Homework.data.calculator.RationalCalc;
import org.example.Seminar5.Homework.models.ModelComplex;
import org.example.Seminar5.Homework.models.ModelRational;

public class Controller {
    public Controller() {
    }

    public double sendRational(RationalCalc calculator) {
        ModelRational model = new ModelRational();
        return model.calculate(calculator);
    }

    public Complex sendComplex(ComplexCalc calculator) {
        ModelComplex model = new ModelComplex();
        return model.calculate(calculator);
    }
}
