package org.example.Seminar2.Task2;

public class Dog extends Animal {
    static int count;
    int runDistance;
    int swimDistance;

    public Dog(String name, int runDistance, int swimDistance) {
        super(name);
        if (runDistance > 500) {
            this.runDistance = 500;
            System.out.println("Ввод некорректен, установлено максимальное значение");
        }
        else this.runDistance = runDistance;
        if (swimDistance > 10) {
            this.swimDistance = 10;
            System.out.println("Ввод некорректен, установлено максимальное значение");
        } else this.swimDistance = runDistance;
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
        if (distance > swimDistance) {
            System.out.println(super.name + " не сможет проплыть :(");
        } else {
            System.out.println(super.name + " проплыл :3 " + swimDistance + " м");
        }
    }
}
