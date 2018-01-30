package com.makarov.unary;

import com.makarov.service.Function;

public class Tangent extends Function {

    public double calculate(double x) {
        return Math.tan(leftParameter.calculate(x));
    }

    public Function diff() {
        return null;
    }
}
