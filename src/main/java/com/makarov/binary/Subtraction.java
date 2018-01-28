package com.makarov.binary;

import com.makarov.service.Function;

public class Subtraction extends Function {

    public double calculate(double x) {
        return leftParameter.calculate(x) - rightParameter.calculate(x);
    }
    @Override
    public String toString() {
        return "Subtraction (" + leftParameter.toString() + " - " + rightParameter.toString() + ")";
    }
}
