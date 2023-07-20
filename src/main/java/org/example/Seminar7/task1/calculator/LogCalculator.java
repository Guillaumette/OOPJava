package org.example.Seminar7.task1.calculator;

public class LogCalculator implements Calculable {

    private Calculable decorated;
    private Loggable logger;

    public LogCalculator(Calculable decorated, Loggable logger) {
        this.decorated = decorated;
        this.logger = logger;
    }

    public LogCalculator(Calculator calculator, Loggable logger) {
    }

    @Override
    public Calculable sum(int arg) {
        logger.log("Вызов метода sum с параметром = " + arg);
        return decorated.sum(arg);
    }

    @Override
    public Calculable multi(int arg) {
        logger.log("Вызов метода multi с параметром = " + arg);
        return decorated.multi(arg);
    }

    @Override
    public int getResult() {
        logger.log("Результирующий лог ");
        return decorated.getResult();
    }
}
