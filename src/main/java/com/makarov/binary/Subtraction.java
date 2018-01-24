package com.makarov.binary;

import com.makarov.service.BinaryElementExp;

public class Subtraction extends BinaryElementExp {
    public Subtraction(double firstParam, double secondParam) {
        firstArg = firstParam;
        secondArg = secondParam;
        calculate();
    }

    public Subtraction() {
    }

    public double calculate() {
        return result = firstArg - secondArg;
    }
}
