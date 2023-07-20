package org.example.Seminar7.task1.calculator;

public class LogCalculableFactory implements ICalculableFactory{
    private Loggable logger;

    public LogCalculableFactory(Loggable logger) {
        this.logger = logger;
    }

    @Override
    public Calculable create(int primaryArg) {
        return new LogCalculator(new Calculator(primaryArg), logger);
    }
}
