package com.makarov.binary;

import com.makarov.service.Function;

public class Multiplication extends Function {

    public double calculate(double x) {
        return leftParameter.calculate(x) * rightParameter.calculate(x);
    }
    @Override
    public String toString() {
        return "Multiplication (" + leftParameter.toString() + " * " + rightParameter.toString() + ")";
    }
}
