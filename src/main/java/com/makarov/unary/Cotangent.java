package com.makarov.unary;

import com.makarov.service.Function;

public class Cotangent extends Function {

    public double calculate(double x) {
        return 1/Math.tan(leftParameter.calculate(x));
    }
}
