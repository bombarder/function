package com.makarov;

public class Constant extends UnaryElementExp{

    public Constant(double value) {
        calculate(value);
    }

    public double calculate(double value) {
        return value;
    }
}
