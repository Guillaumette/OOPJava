package org.example.Seminar2.Task3;

public class Skateboard implements Transport {
    @Override
    public void start() {
        System.out.println("Скейт поехал");
    }

    @Override
    public void stop() {
        System.out.println("Скейт остановился");
    }
}
