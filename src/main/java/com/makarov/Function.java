package com.makarov;

public abstract class Function {

    double result;
    double input;

    public abstract double calculate(double value);

    @Override
    public String toString() {
        return getClass().getSimpleName() + " of " + input + " executed with the result: " + result;
    }
}
