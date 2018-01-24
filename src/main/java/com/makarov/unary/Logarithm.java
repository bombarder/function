package com.makarov.unary;

import com.makarov.service.UnaryElementExp;

public class Logarithm extends UnaryElementExp {
    public Logarithm(double value) {
        firstArg = value;
        calculate();
    }

    public Logarithm() {
    }

    public double calculate() {
        return result = Math.log(firstArg);
    }
}
