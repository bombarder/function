package com.makarov.unary;

import com.makarov.service.Function;

public class Logarithm extends Function {

    public double calculate(double x) {
        return Math.log(x);
    }
    @Override
    public String toString() {
        return "Logarithm (" + leftParameter.toString() + ")";
    }
}
