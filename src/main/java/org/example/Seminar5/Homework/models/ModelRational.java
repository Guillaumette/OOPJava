package org.example.Seminar5.Homework.models;

import org.example.Seminar5.Homework.data.calculator.RationalCalc;
import org.example.Seminar5.Homework.data.operationRational.RatDiff;
import org.example.Seminar5.Homework.data.operationRational.RatDiv;
import org.example.Seminar5.Homework.data.operationRational.RatMult;
import org.example.Seminar5.Homework.data.operationRational.RatSum;

public class ModelRational extends Model<RationalCalc, Double>{
    @Override
    public Double calculate(RationalCalc calc) {
        switch (calc.getOperation()) {
            case '+': {
                return new RatSum().sum(calc.getOperandOne(), calc.getOperandTwo());
            }
            case '-': {
                return new RatDiff().diff(calc.getOperandOne(), calc.getOperandTwo());
            }
            case '/': {
                return new RatDiv().div(calc.getOperandOne(), calc.getOperandTwo());
            }
            case '*': {
                return new RatMult().mult(calc.getOperandOne(), calc.getOperandTwo());
            }
        }
        return null;
    }
}
