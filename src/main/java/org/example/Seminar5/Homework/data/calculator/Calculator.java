package org.example.Seminar5.Homework.data.calculator;

public abstract class Calculator<N> {
    protected N operandOne;
    protected N operandTwo;
    protected char operation;

    public char getOperation() {
        return operation;
    }

    public N getOperandOne() {
        return operandOne;
    }

    public N getOperandTwo() {
        return operandTwo;
    }
}
