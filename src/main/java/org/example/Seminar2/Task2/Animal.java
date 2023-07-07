package org.example.Seminar2.Task2;

public abstract class Animal {
    static int count;
    String name;

    public Animal(String name) {
        this.name = name;
        count++;
    }

    protected abstract void run(int distance);
    protected abstract void swim(int distance);
}
