package org.example.Seminar1.oop1.cw1;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", "черный", 21);
        System.out.println("Кот: " +cat1.name+ ", " + cat1.color +
                " цвета, имеет возраст: " + cat1.age + " лет");
        Cat cat2 = new Cat("Мурзик", "белый", 3);
        System.out.println("Кот: " +cat2.name+ ", " + cat2.color +
                " цвета, имеет возраст: " + cat2.age + " лет");
    }

}
