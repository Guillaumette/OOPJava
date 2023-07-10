package org.example.Seminar4.Task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        List<Integer> listInt = new ArrayList<>();
        List<Double> listDouble = new ArrayList<>();
        List<Number> listNumber = new ArrayList<>();
        for (int i = 0; i < 101; i++) {
            listInt.add(i);
            listDouble.add(((double) i));
            listNumber.add(i);
        }
        System.out.println("calculator.sum(listNumber) = " + calculator.sum(listNumber));
        System.out.println("calculator.sum(listInt) = " + calculator.sum(listInt));
        System.out.println("calculator.sum(listDouble) = " + calculator.sum(listDouble));
    }
}
