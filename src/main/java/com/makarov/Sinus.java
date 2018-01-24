package com.makarov;

public class Sinus extends Function {

    Sinus(double value) {
        input = value;
        calculate(value);
    }

    public Sinus() {

    }

    public double calculate(double value) {
        return result = Math.sin(value);
    }
}
