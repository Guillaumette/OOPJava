package org.example.Seminar6.homework.model;

import org.example.Seminar6.homework.data.*;

public class ComplexModel implements Model {
    @Override
    public Complex calculate(Calculator calc) {
        switch (calc.getOperation()) {
            case '+' -> {
                return new ComplexSum().getExecution(calc.getOperandOne(), calc.getOperandTwo());
            }
            case '-' -> {
                return new ComplexDiff().getExecution(calc.getOperandOne(), calc.getOperandTwo());
            }
            case '/' -> {
                return new ComplexDiv().getExecution(calc.getOperandOne(), calc.getOperandTwo());
            }
            case '*' -> {
                return new ComplexMult().getExecution(calc.getOperandOne(), calc.getOperandTwo());
            }
        }
        return null;
    }
}
