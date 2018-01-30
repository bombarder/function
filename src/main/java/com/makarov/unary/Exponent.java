package com.makarov.unary;

import com.makarov.service.Function;

public class Exponent extends Function {

    public double calculate(double x) {
        return Math.exp(x);
    }

//    @Override
//    public String toString() {
//        return "Exponent (" + leftParameter.toString() + ")";
//    }
}
