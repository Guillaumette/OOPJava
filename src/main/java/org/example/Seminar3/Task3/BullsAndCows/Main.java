package org.example.Seminar3.Task3.BullsAndCows;

import org.example.Seminar3.Task3.BullsAndCows.Version.AbstractGame;
import org.example.Seminar3.Task3.BullsAndCows.Version.EngGame;
import org.example.Seminar3.Task3.BullsAndCows.Version.NumberGame;
import org.example.Seminar3.Task3.BullsAndCows.Version.RuGame;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Это игра <<Быки и коровы!>>\n" +
                "Ознакомимся с правилами:\n" +
                "Вы должны отгадать, какое слово или число загадал компьютер\n" +
                "Количество символов в слове/числе, а также количество попыток вы определяете сами!\n" +
                "Вывод <<Коровы>> с числом означает, что вы правильно отгадали цифру/букву в загаданном,\n" +
                "а вывод <<Быки>> - что вы также отгадали позицию символа\n" +
                "Приятной игры!\n"
        );
        Scanner sc = new Scanner(System.in);
        boolean restart = true;
        while (restart) {
            System.out.println("Следующие версии игры доступны:\n" +
                    "Если хотите угадывать числа, введите NUM\n" +
                    "Если хотите угадывать русские слова, введите RU\n +" +
                    "Если хотите угадывать английские слова - введите EN\n"
            );
            GameVersion version = GameVersion.valueOf(sc.next());
            AbstractGame game = versionChoice(version);
            System.out.print("Введите длину слова: ");
            int wordLength = sc.nextInt();
            System.out.print("Введите количество попыток: ");
            int triesQty = sc.nextInt();
            sc.nextLine();
            game.start(wordLength, triesQty);
            List<Logging> logging = new LinkedList<>(Arrays.asList(
                    new Logging("Старт", game.getWord())));
            boolean isFinish = false;
            boolean isWin = false;
            String input = null;
            Answer answer = null;
            while (!(isFinish || isWin)) {
                System.out.print("Слово: ");
                input = sc.nextLine();
                answer = game.inputValue(input);
                if (answer != null) System.out.println(answer);
                isWin = game.getGameStatus() == GameStatus.WIN;
                isFinish = game.getGameStatus() == GameStatus.FINISH;
                logging.add(new Logging(input, answer));
            }
            finishGame(logging, isWin, input, answer);
            loggingGame(sc, logging);
            System.out.println("Перезапустить игру? Д/Н: ");
            input = sc.next();
            if (!(input.toUpperCase().equals("Д"))) restart = false;
        }
        sc.close();
    }

    private static void loggingGame(Scanner sc, List<Logging> logging) {
        System.out.print("Показать все ваши попытки? Д/Н: ");
        String input = sc.next();
        if (input.toUpperCase().equals("Д")) {
            for (Logging log : logging) {
                System.out.println(log);
            }
        }
    }

    private static void finishGame(List<Logging> logging, boolean isWin, String input, Answer answer) {
        if (isWin) {
            System.out.println("Вы победили, поздравляем! :)");
        } else {
            System.out.println("К сожалению, вы проиграли :(");
            logging.add(new Logging("Проигрыш", input, answer));
        }
    }

    private static AbstractGame versionChoice(GameVersion version) {
        AbstractGame game = null;
        switch (version) {
            case RU:
                game = new RuGame();
                break;
            case EN:
                game = new EngGame();
                break;
            case NUM:
                game = new NumberGame();
                break;
        }
        return game;
    }
}
