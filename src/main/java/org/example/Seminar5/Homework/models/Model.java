package org.example.Seminar5.Homework.models;

import org.example.Seminar5.Homework.data.calculator.Calculator;

public abstract class Model<N extends Calculator<E>, E> {
    public abstract E calculate(N calculator);
}
