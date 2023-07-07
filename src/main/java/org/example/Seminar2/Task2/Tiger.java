package org.example.Seminar2.Task2;

public class Tiger extends Cat {
    static int count;

    public Tiger(String name, int runDistance) {
        super(name, runDistance);
        count++;
    }
}
