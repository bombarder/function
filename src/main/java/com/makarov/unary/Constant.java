package com.makarov.unary;

import com.makarov.service.UnaryElementExp;

public class Constant extends UnaryElementExp {

    public Constant(double value) {
        firstArg = value;
        calculate();
    }

    public Constant() {
    }

    public double calculate() {
        return result = firstArg;
    }
}
