package com.makarov.unary;

import com.makarov.service.UnaryElementExp;

public class Exponent extends UnaryElementExp {
    public Exponent(double value) {
        firstArg = value;
        calculate();
    }

    public Exponent() {
    }

    public double calculate() {
        return result = Math.exp(firstArg);
    }
}
