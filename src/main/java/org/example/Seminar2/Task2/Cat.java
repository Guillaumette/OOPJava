package org.example.Seminar2.Task2;

public class Cat extends Animal {
    static int count;
    int runDistance;

    public Cat(String name, int runDistance) {
        super(name);
        if (runDistance > 200) {
            this.runDistance = 200;
            System.out.println("Ввод некорректен, установлено максимальное значение");
        }
        else this.runDistance = runDistance;
        count++;
    }

    @Override
    protected void run(int distance) {
        if (distance > runDistance) {
            System.out.println(super.name + " не сможет пробежать :(");
        } else {
            System.out.println(super.name + " пробежал :3 " + runDistance + " м");
        }
    }

    @Override
    protected void swim(int distance) {
        System.out.println(super.name + " не умеет плавать");

    }
}
