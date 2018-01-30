package com.makarov.binary;

import com.makarov.service.Function;

public class Division extends Function {

    public double calculate(double x) {
        return leftParameter.calculate(x) / rightParameter.calculate(x);
    }

    public Function diff() {
        return null;
    }
    @Override
    public String toString() {
        return "(" + leftParameter.toString() + ")*(" + rightParameter.toString() + ")";
    }
}
