package org.example.Seminar1.oop1.cw4;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", "черный", 21);
        System.out.println("Кот: " + cat1.getName() + ", " + cat1.getColor() +
                " цвет, имеет возраст: " + cat1.getAge() + " лет");
        Cat cat2 = new Cat("Мурзик", "белый", 3);
        cat2.setName("Тихон");
        System.out.println("Кот: " + cat2.getName() + ", " + cat2.getColor() +
                " цвет, имеет возраст: " + cat2.getAge() + " лет");
        cat1.animalInfo();
        cat1.voice();
        Dog dog = new Dog("Барбос");
        dog.voice();
    }
}
