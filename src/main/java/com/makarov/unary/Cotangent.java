package com.makarov.unary;

import com.makarov.service.UnaryElementExp;

public class Cotangent extends UnaryElementExp {
    public Cotangent(double value) {
        firstArg = value;
        calculate();
    }

    public Cotangent() {
    }

    public double calculate() {
        return result = 1/Math.tan(firstArg);
    }
}
