package org.example.Seminar2.Homework.Obstacles;

public class Racetrack extends Obstacles {
    private final int distance;

    public Racetrack(String name, int distance) {
        super(name);
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "name=" + name +
                ", distance=" + distance + '\n';
    }
}
