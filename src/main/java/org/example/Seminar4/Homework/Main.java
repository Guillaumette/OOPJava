package org.example.Seminar4.Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        List<Integer> listInt = new ArrayList<>();
        List<Double> listDouble = new ArrayList<>();
        List<Number> listNumber = new ArrayList<>();
        List<String> listString = new ArrayList<>(Arrays.asList("1.0", "2.12", "3.123", "4.1234", "5.12345", "6", "7.999"));
        for (int i = 1; i < 11; i++) {
            listInt.add(i);
            listDouble.add(((double) i));
            listNumber.add(i);
        }
        System.out.println("Сумма:");
        System.out.println("calculator.sum(listNumber) = " + calculator.sum(listNumber));
        System.out.println("calculator.sum(listInt) = " + calculator.sum(listInt));
        System.out.println("calculator.sum(listDouble) = " + calculator.sum(listDouble));
        System.out.println();
        System.out.println("Умножение:");
        System.out.println("calculator.mult(listNumber) = " + calculator.mult(listNumber));
        System.out.println("calculator.mult(listInt) = " + calculator.mult(listInt));
        System.out.println("calculator.mult(listDouble) = " + calculator.mult(listDouble));
        System.out.println();
        System.out.println("Деление:");
        System.out.println("calculator.div(listNumber) = " + calculator.div(listNumber));
        System.out.println("calculator.div(listInt) = " + calculator.div(listInt));
        System.out.println("calculator.div(listDouble) = " + calculator.div(listDouble));
        System.out.println();
        System.out.println("Бинарное представление:");
        System.out.println("calculator.binaryPres(listNumber) = " + calculator.binaryPres(listNumber));
        System.out.println("calculator.binaryPres(listInt) = " + calculator.binaryPres(listInt));
        System.out.println("calculator.binaryPres(listDouble) = " + calculator.binaryPres(listDouble));
        System.out.println("calculator.binaryPres(listString) = " + calculator.binaryPres(listString));
    }
}
