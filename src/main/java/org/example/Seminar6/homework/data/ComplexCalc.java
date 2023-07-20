package org.example.Seminar6.homework.data;

public class ComplexCalc implements Calculator {
    protected Complex operandOne;
    protected Complex operandTwo;
    protected char operation;

    public ComplexCalc(String sc) {
        char[] chars = sc.toCharArray();
        String tmp = "";
        double re;
        double im;
        for (char ch : chars) {
            if (ch == '/' || ch == '*' || ch == '+' || ch == '-') {
                operation = ch;
                String[] complex = tmp.strip().split(" ");
                re = Double.parseDouble(complex[0]);
                im = Double.parseDouble(complex[1]);
                operandOne = new Complex(re, im);
                tmp = "";
            } else tmp += ch;
        }
        String[] complex = tmp.strip().split(" ");
        re = Double.parseDouble(complex[0]);
        im = Double.parseDouble(complex[1]);
        operandTwo = new Complex(re, im);
    }

    public ComplexCalc(Complex operand, String sc) {
        operandOne = operand;
        char[] chars = sc.toCharArray();
        String tmp = "";
        double re;
        double im;
        for (char ch : chars) {
            if (ch == '/' || ch == '*' || ch == '+' || ch == '-') {
                operation = ch;
                tmp = "";
            } else tmp += ch;
        }
        String[] complex = tmp.strip().split(" ");
        re = Double.parseDouble(complex[0]);
        im = Double.parseDouble(complex[1]);
        operandTwo = new Complex(re, im);
    }

    public char getOperation() {
        return operation;
    }

    public Complex getOperandOne() {
        return operandOne;
    }

    public Complex getOperandTwo() {
        return operandTwo;
    }

    @Override
    public String toString() {
        return operandOne + " " + operation + " " + operandTwo;
    }
}
