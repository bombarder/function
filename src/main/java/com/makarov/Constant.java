package com.makarov;

public class Constant extends UnaryElementExp{

    public Constant(double value) {
        firstArg = value;
        calculate();
    }

    public double calculate() {
        return firstArg;
    }
}
