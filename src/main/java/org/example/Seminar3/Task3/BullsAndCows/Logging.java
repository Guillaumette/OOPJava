package org.example.Seminar3.Task3.BullsAndCows;

public class Logging {
    private String attempt;
    private String value;
    private Answer answer;

    static int count;

    public Logging(String attempt, String value) {
        this.attempt = attempt;
        this.value = value;
        answer = new Answer(0,0);
    }

    public Logging(String value, Answer answer) {
        this.attempt = "Попытка номер " + ++count;
        this.value = value;
        this.answer = answer;
    }

    public Logging(String attempt, String value, Answer answer) {
        this.attempt = attempt;
        this.value = value;
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "-" + attempt + ", " + value + ", " + answer.getBulls() + ", " + answer.getCows();
    }
}
