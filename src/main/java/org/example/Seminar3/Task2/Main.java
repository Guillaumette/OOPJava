package org.example.Seminar3.Task2;

public class Main {
    public static void main(String[] args) {
        Fruits fruit = Fruits.valueOf("BANANA");
        System.out.println("fruit = " + fruit);
        switch (fruit) {
            case APPLE:
            case BANANA:
            case ORANGE:
                System.out.println("Это фрукт " + fruit.name);
                break;
            default:
                System.out.println("Неопознанный фрукт");
        }
        for (Fruits value : Fruits.values()) {
            System.out.println(value);
        }
    }
}
