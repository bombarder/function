package com.makarov.binary;

import com.makarov.service.BinaryElementExp;

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
