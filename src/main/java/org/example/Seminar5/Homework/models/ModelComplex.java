package org.example.Seminar5.Homework.models;

import org.example.Seminar5.Homework.data.calculator.ComplexCalc;
import org.example.Seminar5.Homework.data.Complex;
import org.example.Seminar5.Homework.data.operationComplex.ComplexDiff;
import org.example.Seminar5.Homework.data.operationComplex.ComplexDiv;
import org.example.Seminar5.Homework.data.operationComplex.ComplexMult;
import org.example.Seminar5.Homework.data.operationComplex.ComplexSum;

public class ModelComplex extends Model<ComplexCalc, Complex> {
    @Override
    public Complex calculate(ComplexCalc calc) {
        switch (calc.getOperation()) {
            case '+': {
                return new ComplexSum().sum(calc.getOperandOne(), calc.getOperandTwo());
            }
            case '-': {
                return new ComplexDiff().diff(calc.getOperandOne(), calc.getOperandTwo());
            }
            case '/': {
                return new ComplexDiv().div(calc.getOperandOne(), calc.getOperandTwo());
            }
            case '*': {
                return new ComplexMult().multi(calc.getOperandOne(), calc.getOperandTwo());
            }
        }
        return null;
    }
}
