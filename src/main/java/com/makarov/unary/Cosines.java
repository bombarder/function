package com.makarov.unary;

import com.makarov.service.Function;

public class Cosines extends Function {

    public double calculate(double x) {
        return Math.cos(leftParameter.calculate(x));
    }

    public Function diff() {
        return null;
    }
    @Override
    public String toString() {
        return "(" + leftParameter.toString() + ")*(" + rightParameter.toString() + ")";
    }
}
