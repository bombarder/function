package com.makarov.unary;

import com.makarov.service.UnaryElementExp;

public class Cosines extends UnaryElementExp {
    public Cosines(double value) {
        firstArg = value;
        calculate();
    }

    public Cosines() {
    }

    public double calculate() {
        return result = Math.cos(firstArg);
    }
}
