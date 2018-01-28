package com.makarov.unary;

import com.makarov.service.Function;

public class Cotangent extends Function {

    public double calculate(double x) {
        return 1/Math.tan(x);
    }
    @Override
    public String toString() {
        return "Cotangent (" + leftParameter.toString() + ")";
    }
}
