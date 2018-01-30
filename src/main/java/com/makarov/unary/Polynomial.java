package com.makarov.unary;

import com.makarov.binary.Division;
import com.makarov.binary.Multiplication;
import com.makarov.service.Function;

public class Polynomial extends Function {
    /*
        Working with y = 5*cos(x)-x/2 polynomial
        */
    public double calculate(double x) {
        double leftPart = 5 * new Cosines().calculate(leftParameter.calculate(x));
        double rightPart = new Division().calculate(leftParameter.calculate(x));
        return leftPart - rightPart;
    }

    public Function diff() {
        return null;
    }
    @Override
    public String toString() {
        return "(" + leftParameter.toString() + ")*(" + rightParameter.toString() + ")";
    }
}
