package org.example.Lection5.Ex001Calc;

public class Main {
    public static void main(String[] args) {
        Presenter p = new Presenter(new SumModel(), new View());
        p.buttonClick();
    }
}
