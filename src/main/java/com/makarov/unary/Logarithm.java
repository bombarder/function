package com.makarov.unary;

import com.makarov.service.Function;

public class Logarithm extends Function {

    public double calculate(double x) {
        return Math.log(leftParameter.calculate(x));
    }
}
