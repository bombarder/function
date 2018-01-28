package com.makarov.unary;

import com.makarov.service.Function;

public class Tangent extends Function {

    public double calculate(double x) {
        return Math.tan(x);
    }
    @Override
    public String toString() {
        return "Tangent (" + leftParameter.toString() + ")";
    }
}
