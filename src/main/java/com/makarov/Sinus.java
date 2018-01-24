package com.makarov;

public class Sinus extends UnaryElementExp {

    Sinus(double value) {
        firstArg = value;
        calculate(value);
    }

    Sinus() {

    }

    public double calculate(double value) {
        return result = Math.sin(value);
    }
}
