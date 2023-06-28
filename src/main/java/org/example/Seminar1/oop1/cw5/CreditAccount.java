package org.example.Seminar1.oop1.cw5;

public class CreditAccount extends Account{
    private double degreePercent;

    public CreditAccount(String owner, Integer number, double balance, double degreePercent){
        super(owner, number, balance);
        this.degreePercent = degreePercent;
    }

    public double getDegreePercent() {
        return degreePercent;
    }

    public void setDegreePercent(double degreePercent) {
        this.degreePercent = degreePercent;
    }

    public void calculateInterest(){
        double result = getBalance() * degreePercent / 100;
        withdraw(result);
    }

    @Override
    public String toString() {
        return "CreditAccount{" +
                "degreePercent=" + degreePercent +
                '}';
    }
}
