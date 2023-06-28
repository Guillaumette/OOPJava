package org.example.Seminar1.oop1.cw5;

public class Main {
    public static void main(String[] args) {
        CreditAccount credit = new CreditAccount("Иван Иванов", 123451, 1000, 10.0);
        SafeAccount safe = new SafeAccount("Иван Иванов", 34561, 3000, 5.0);
        System.out.println("До начисления процентов по кредиту: " + credit.getBalance());
        credit.calculateInterest();
        System.out.println("После начисления процентов по кредиту: " + credit.getBalance());
        System.out.println("До начисления процентов на сберегательный счет: " + safe.getBalance());
        safe.addInterest();
        System.out.println("После начисления процентов на сберегательный счет: " + safe.getBalance());
    }
}
