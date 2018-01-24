package com.makarov.binary;

import com.makarov.service.BinaryElementExp;

public class Multiplication extends BinaryElementExp {
    public Multiplication(double firstParam, double secondParam) {
        firstArg = firstParam;
        secondArg = secondParam;
        calculate();
    }

    public Multiplication() {
    }

    public double calculate() {
        return result = firstArg * secondArg;
    }
}
