package com.makarov.binary;

import com.makarov.service.BinaryElementExp;

public class Division extends BinaryElementExp {
    public Division(double firstParam, double secondParam) {
        firstArg = firstParam;
        secondArg = secondParam;
        calculate();
    }

    public Division() {
    }

    public double calculate() {
        return result = firstArg / secondArg;
    }
}
