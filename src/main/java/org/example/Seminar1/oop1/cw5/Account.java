package org.example.Seminar1.oop1.cw5;

public class Account {
    private String owner;
    private Integer number;
    private double balance;

    public Account(String owner, Integer number, double balance) {
        this.owner = owner;
        this.number = number;
        this.balance = balance;
    }

    public Account() {
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        if (this.balance >= amount){
            this.balance -= amount;
        } else {
            System.out.println("Недостаточно средств на счете\n Остаток на счете: " + this.balance);
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "owner='" + owner + '\'' +
                ", number=" + number +
                ", balance=" + balance +
                '}';
    }
}
