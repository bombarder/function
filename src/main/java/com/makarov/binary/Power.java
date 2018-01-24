package com.makarov.binary;

import com.makarov.service.BinaryElementExp;

public class Power extends BinaryElementExp {
    public Power(double firstParam, double secondParam) {
        firstArg = firstParam;
        secondArg = secondParam;
        calculate();
    }

    public Power() {
    }

    public double calculate() {
        return result = Math.pow(firstArg,secondArg);
    }
}
