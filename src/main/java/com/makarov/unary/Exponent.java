package com.makarov.unary;

import com.makarov.binary.Multiplication;
import com.makarov.service.Function;

public class Exponent extends Function {

    public double calculate(double x) {
        return Math.exp(leftParameter.calculate(x));
    }

    public Function diff() {
        Function f1 = new Multiplication();
        f1.leftParameter = new Exponent();
        f1.leftParameter.leftParameter = leftParameter;
        f1.rightParameter = leftParameter.diff();
        return f1;
    }

    @Override
    public String toString() {
        return "Exp(" + leftParameter.toString();
    }
}
