package org.example.Seminar2.Task3;

public class Car implements Transport {

    @Override
    public void start() {
        System.out.println("Машина поехала");
    }

    @Override
    public void stop() {
        System.out.println("Машина остановилась");
    }
}
