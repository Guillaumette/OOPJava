package org.example.Seminar7.task1.calculator;

public class ConsoleLogger implements Loggable{
    @Override
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
