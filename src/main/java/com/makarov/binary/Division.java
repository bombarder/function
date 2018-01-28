package com.makarov.binary;

import com.makarov.service.Function;

public class Division extends Function {

    public double calculate(double x) {
        return leftParameter.calculate(x) / rightParameter.calculate(x);
    }
    @Override
    public String toString() {
        return "Division (" + leftParameter.toString() + " / " + rightParameter.toString() + ")";
    }
}
