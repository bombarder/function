package com.makarov.unary;

import com.makarov.service.Function;

public class SquareRoot extends Function {

    public double calculate(double x) {
        return Math.sqrt(leftParameter.calculate(x));
    }

    public Function diff() {
        return null;
    }
}
