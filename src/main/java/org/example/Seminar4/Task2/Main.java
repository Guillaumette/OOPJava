package org.example.Seminar4.Task2;

public class Main {
    public static void main(String[] args) {
        BoxWithNumber<Integer> box1 = new BoxWithNumber(1, 2, 3, 4, 5);
        System.out.println("box1.average() = " + box1.average());
        BoxWithNumber<Double> box2 = new BoxWithNumber(1.0, 2.0, 3.0, 4.0, 5.0);
        System.out.println("box2.average() = " + box2.average());

        System.out.println("box1.compareAverage(box2) = " + box1.compareAverage(box2));
    }
}
