package com.makarov.unary;

import com.makarov.service.UnaryElementExp;

public class Sinus extends UnaryElementExp {

    public Sinus(double value) {
        firstArg = value;
        calculate();
    }

    public Sinus() {

    }

    public double calculate() {
        return result = Math.sin(firstArg);
    }
}
