package com.makarov.binary;

import com.makarov.service.UnaryElementExp;
import com.makarov.unary.Cosines;

public class Polynomial extends UnaryElementExp {
    public Polynomial(double value) {
        firstArg = value;
        calculate();
    }

    public Polynomial() {
    }

    /*
    Working with y = 5*cos(x)-x/2 polynomial
    */
    public double calculate() {
        double leftPart = new Multiplication(5, new Cosines(firstArg).calculate()).calculate();
        double rightPart = new Division(firstArg,2).calculate();
        return result = leftPart - rightPart;
    }
}
