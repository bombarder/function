package com.makarov.unary;

import com.makarov.service.Function;

public class Sinus extends Function {

    public double calculate(double x) {
        return Math.sin(leftParameter.calculate(x));
    }

    public Function diff() {
        return null;
    }
}
