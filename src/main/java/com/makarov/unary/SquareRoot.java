package com.makarov.unary;

import com.makarov.service.UnaryElementExp;

public class SquareRoot extends UnaryElementExp {
    public SquareRoot(double value) {
        firstArg = value;
        calculate();
    }

    public SquareRoot() {
    }

    public double calculate() {
        return result = Math.sqrt(firstArg);
    }
}
