package com.makarov.unary;

import com.makarov.service.Function;

public class Cosines extends Function {

    public double calculate(double x) {
        return Math.cos(leftParameter.calculate(x));
    }
}
