package com.makarov.unary;

import com.makarov.service.Function;

public class Sinus extends Function {

    public double calculate(double x) {
        return Math.sin(x);
    }
    @Override
    public String toString() {
        return "Sinus (" + leftParameter.toString() + ")";
    }
}
