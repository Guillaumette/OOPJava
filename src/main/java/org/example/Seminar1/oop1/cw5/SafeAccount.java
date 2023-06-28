package org.example.Seminar1.oop1.cw5;

public class SafeAccount extends Account {
    private double percent;

    public SafeAccount(String owner, Integer number, double balance, double percent) {
        super(owner, number, balance);
        this.percent = percent;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public void addInterest() {
        double result = getBalance() * percent / 100;
        deposit(result);
    }

    @Override
    public String toString() {
        return "SafeAccount{" +
                "percent=" + percent +
                '}';
    }
}
