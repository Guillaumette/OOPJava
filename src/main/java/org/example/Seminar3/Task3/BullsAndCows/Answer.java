package org.example.Seminar3.Task3.BullsAndCows;

public class Answer {
    private int bulls;
    private int cows;

    public Answer(int bulls, int cows) {
        this.bulls = bulls;
        this.cows = cows;
    }

    public Answer(){}

    public int getBulls() {
        return bulls;
    }

    public int getCows() {
        return cows;
    }

    @Override
    public String toString() {
        return "Быков: " + bulls +
                ", Коров: " + cows;
    }
}
