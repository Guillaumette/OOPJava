package org.example.Seminar5.Homework.view;

import org.example.Seminar5.Homework.controllers.Controller;
import org.example.Seminar5.Homework.data.Complex;
import org.example.Seminar5.Homework.data.Log;
import org.example.Seminar5.Homework.data.calculator.ComplexCalc;
import org.example.Seminar5.Homework.data.calculator.RationalCalc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class View {
    private final Controller controller = new Controller();
    private Status status = Status.FIRST;

    private List<Log> logging = new ArrayList<>();
    public void start() {
        Scanner sc = new Scanner(System.in).useDelimiter("\r?\n");
        System.out.println("""
                _________________________________________
                С какими числами работать? Нажмите соответствующую цифру\s
                [1]- рациональные числа
                [2]- комплексные числа
                [C]- для выхода""");
        String key = sc.next().strip().toLowerCase();
        switch (key) {
            case "1": {
                caseRational(sc);
            }
            case "2": {
                caseComplex(sc);
            }
            default: {
                sc.close();
            }
        }
    }

    public void caseRational(Scanner sc) {
        System.out.println("""
                ______________РАЦИОНАЛЬНЫЕ ЧИСЛА______________
                ИНСТРУКЦИЯ:
                Формат введения значения:\s
                <Число СимволОперации Число>""");
        String key = sc.next().toLowerCase();
        RationalCalc calc;
        double result = 0;
        while (!key.equals("c")) {
            if (status == Status.FIRST) {
                calc = new RationalCalc(key);
                status = Status.NEXT;
            } else calc = new RationalCalc(result, key);
            result = controller.sendRational(calc);
            logging.add(new Log(calc, result));
            System.out.print(result);
            key = sc.next().toLowerCase();
        }
        sc.nextLine();
        loggingOperation(sc, logging);
    }
    public void caseComplex(Scanner sc) {
        System.out.println("""
                ______________КОМПЛЕКСНЫЕ ЧИСЛА______________
                ИНСТРУКЦИЯ:
                Формат введения значения:\s
                <Действительное Мнимое СимволОперации Действительное Мнимое>""");
        String key = sc.next().toLowerCase();
        ComplexCalc calc;
        Complex result = null;
        while (!key.equals("c")) {
            if (status == Status.FIRST) {
                calc = new ComplexCalc(key);
                status = Status.NEXT;
            } else calc = new ComplexCalc(result, key);
            result = controller.sendComplex(calc);
            logging.add(new Log(calc, result));
            System.out.print(result);
            key = sc.next().toLowerCase();
        }
        sc.nextLine();
        loggingOperation(sc, logging);
    }

    private static void loggingOperation(Scanner scanner, List<Log> logging) {
        System.out.print("Хотите посмотреть логи? Д/Н: ");
        String input = scanner.next();
        if (input.toUpperCase().equals("Д")) {
            for (Log log : logging) {
                System.out.println(log);
            }
        }
    }
}
