package com.makarov.unary;

import com.makarov.service.UnaryElementExp;

public class Tangent extends UnaryElementExp {
    public Tangent(double value) {
        firstArg = value;
        calculate();
    }

    public Tangent() {
    }

    public double calculate() {
        return result = Math.tan(firstArg);
    }
}
