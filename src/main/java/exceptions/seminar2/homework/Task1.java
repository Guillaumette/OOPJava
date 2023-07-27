package exceptions.seminar2.homework;

import java.util.Scanner;

/**
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
 * и возвращает введенное значение. Ввод текста вместо числа не должен приводить к падению приложения,
 * вместо этого необходимо повторно запросить у пользователя ввод данных.
 */
public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        isFloat();
        isNextFloat();
    }

    /**
     * @apiNote проверка на float через HasFloat
     */
    public static void isFloat() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print(">>>");
            if (sc.hasNextFloat()) {
                System.out.println(sc.nextFloat());
                break;
            }
            System.out.println("Это не число, введите ЧИСЛО ");
        }
    }

    /**
     * @apiNote проверка на float через parseFloat
     */
    public static void isNextFloat() {
        Scanner sc = new Scanner(System.in);
        System.out.print(">>>");
        String result = sc.next();
        while (!inFloat(result)) {
            System.out.println("Это не число, введите ЧИСЛО ");
            System.out.print(">>>");
            result = sc.next();
        }
        System.out.println(result);
    }

    private static boolean inFloat(String num) {
        try {
            Float.parseFloat(num);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }
}
