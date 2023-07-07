package org.example.Seminar2.Task2;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new DomesticCat("Барсик", 20),
                new Tiger("Шерхан", 60),
                new Dog("Шарик", 150, 10),
                new Cat("Мурзик", 25)
        };
        for (Animal animal : animals) {
            animal.run(30);
            animal.swim(10);
        }
        System.out.println("Animal.count = " + Animal.count);
        System.out.println("Dog.count = " + Dog.count);
        System.out.println("Cat.count = " + Cat.count);
        System.out.println("DomesticCat.count = " + DomesticCat.count);
        System.out.println("Tiger.count = " + Tiger.count);
    }
}
