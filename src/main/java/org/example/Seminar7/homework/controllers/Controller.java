package org.example.Seminar7.homework.controllers;

import org.example.Seminar7.homework.data.Complex;
import org.example.Seminar7.homework.data.ComplexCalc;

/**
 * Принцип открытости-закрытости: открыт для расширения конкретными версиями контроллера, закрыт для модификаций
 */
public interface Controller {
    public Complex sendComplex(ComplexCalc calculator);
}

