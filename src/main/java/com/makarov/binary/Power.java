package com.makarov.binary;

import com.makarov.service.Function;

public class Power extends Function {

    public double calculate(double x) {
        return Math.pow(leftParameter.calculate(x), rightParameter.calculate(x));
    }
}
