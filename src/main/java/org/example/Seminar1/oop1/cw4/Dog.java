package org.example.Seminar1.oop1.cw4;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("гав-гав");
    }
}
