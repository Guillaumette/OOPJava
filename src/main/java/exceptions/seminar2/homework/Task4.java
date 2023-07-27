package exceptions.seminar2.homework;

import java.util.Scanner;

/**
 * Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
 * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("введите строку: ");
        String input = sc.nextLine();
        if (input.equals("")) throw new RuntimeException("Строка не должна быть пустой");
    }
}
