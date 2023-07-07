package org.example.Seminar3.Task1;

public enum Month {
    JAN, FEB, MAR, APR(4), MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC;
    private int number;

    Month() {
    }

    Month(int number) {
        this.number = number;
    }
}
