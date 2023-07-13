package org.example.Seminar5.Homework.data.calculator;

public class RationalCalc extends Calculator<Double> {
    public RationalCalc(String in) {
        char[] chars = in.toCharArray();
        String temp = "";
        for (char ch : chars) {
            if (ch == '/' || ch == '*' || ch == '+' || ch == '-') {
                super.operation = ch;
                this.operandOne = Double.parseDouble(temp.strip());
                temp = "";
            } else temp += ch;
        }
        this.operandTwo = Double.parseDouble(temp.strip());
    }
    public RationalCalc(double numOne, String in) {
        this.operandOne = numOne;
        char[] chars = in.toCharArray();
        String temp = "";
        for (char ch : chars) {
            if (ch == '/' || ch == '*' || ch == '+' || ch == '-') {
                super.operation = ch;
                temp = "";
            } else temp += ch;
        }
        this.operandTwo = Double.parseDouble(temp.strip());
    }

    @Override
    public String toString() {
        return operandOne + " " + operation + " " + operandTwo;
    }
}
