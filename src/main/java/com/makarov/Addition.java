package com.makarov;

public class Addition extends BinaryElementExp {
    public Addition(double firstParam, double secondParam) {
        firstArg = firstParam;
        secondArg = secondParam;
        calculate();
    }

    public Addition() {
    }

    public double calculate() {
        return result = firstArg + secondArg;
    }
}
