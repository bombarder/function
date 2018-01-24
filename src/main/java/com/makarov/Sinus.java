package com.makarov;

public class Sinus extends UnaryElementExp {

    Sinus(double value) {
        firstArg = value;
        calculate();
    }

    Sinus() {

    }

    public double calculate() {
        return result = Math.sin(firstArg);
    }
}
