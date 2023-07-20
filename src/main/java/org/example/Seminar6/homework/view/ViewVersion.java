package org.example.Seminar6.homework.view;

import org.example.Seminar6.homework.controllers.Controller;
import org.example.Seminar6.homework.controllers.ControllerVersion;
import org.example.Seminar6.homework.data.Complex;
import org.example.Seminar6.homework.data.ComplexCalc;
import org.example.Seminar6.homework.data.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ViewVersion implements View {
    private final Controller controller;
    private Status status = Status.FIRST;

    private List<Log> logging = new ArrayList<>();

    public ViewVersion() {
        this.controller = new ControllerVersion();
    }

    public void start() {
        Scanner sc = new Scanner(System.in).useDelimiter("\r?\n");
        System.out.println("""
                ___________________КАЛЬКУЛЯТОР КОМПЛЕКСНЫХ ЧИСЕЛ____________________
                ИНСТРУКЦИЯ:
                операции (+, -, *, /), значения вводить в формате:\s
                <Действительное Мнимое СимволОперации Действительное Мнимое>""");
        String key = sc.next().toLowerCase();
        ComplexCalc calculator;
        Complex result = null;
        while (!key.equals("c")) {
            if (status == Status.FIRST) {
                calculator = new ComplexCalc(key);
                status = Status.NEXT;
            } else calculator = new ComplexCalc(result, key);
            result = controller.sendComplex(calculator);
            logging.add(new Log(calculator, result));
            System.out.print(result);
            key = sc.next().toLowerCase();
        }
        sc.nextLine();
        loggingOperation(sc, logging);
    }

    private static void loggingOperation(Scanner scanner, List<Log> logging) {
        System.out.println("Желаете посмотреть логи? Д/Н: ");
        String input = scanner.next();
        if (input.toUpperCase().equals("Д")) {
            for (Log log : logging) {
                System.out.println(log);
            }
        }
    }
}
