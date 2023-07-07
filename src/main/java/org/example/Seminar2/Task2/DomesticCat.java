package org.example.Seminar2.Task2;

public class DomesticCat extends Cat {
    static int count;

    public DomesticCat(String name, int runDistance) {
        super(name, runDistance);
        count++;
    }
}
