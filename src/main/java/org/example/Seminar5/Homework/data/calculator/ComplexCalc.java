package org.example.Seminar5.Homework.data.calculator;

import org.example.Seminar5.Homework.data.Complex;

public class ComplexCalc extends Calculator<Complex> {
    public ComplexCalc(String in) {
        char[] chars = in.toCharArray();
        String temp = "";
        double re;
        double im;
        for (char ch : chars) {
            if (ch == '/' || ch == '*' || ch == '+' || ch == '-') {
                super.operation = ch;
                String[] complex = temp.strip().split(" ");
                re = Double.parseDouble(complex[0]);
                im = Double.parseDouble(complex[1]);
                super.operandOne = new Complex(re, im);
                temp = "";
            } else temp += ch;
        }
        String[] complex = temp.strip().split(" ");
        re = Double.parseDouble(complex[0]);
        im = Double.parseDouble(complex[1]);
        super.operandTwo = new Complex(re, im);
    }

    public ComplexCalc(Complex operand, String in) {
        super.operandOne = operand;
        char[] chars = in.toCharArray();
        String temp = "";
        double re;
        double im;
        for (char ch : chars) {
            if (ch == '/' || ch == '*' || ch == '+' || ch == '-') {
                super.operation = ch;
                temp = "";
            } else temp += ch;
        }
        String[] complex = temp.strip().split(" ");
        re = Double.parseDouble(complex[0]);
        im = Double.parseDouble(complex[1]);
        super.operandTwo = new Complex(re, im);
    }

    @Override
    public String toString() {
        return operandOne + " " + operation + " " + operandTwo;
    }
}