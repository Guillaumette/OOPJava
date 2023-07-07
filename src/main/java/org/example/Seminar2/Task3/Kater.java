package org.example.Seminar2.Task3;

public class Kater implements Transport {
    @Override
    public void start() {
        System.out.println("Катер поплыл");
    }

    @Override
    public void stop() {
        System.out.println("Катер остановился");
    }
}
