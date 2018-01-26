package com.makarov.unary;

import com.makarov.binary.Division;
import com.makarov.binary.Multiplication;
import com.makarov.service.Function;

public class Polynomial extends Function {
    public double calculate(double inputFirstValue, double inputSecondValue) {
        return 0;
    }

    /*
        Working with y = 5*cos(x)-x/2 polynomial
        */
    public double calculate(double inputFirstValue) {
        double leftPart = new Multiplication().calculate(5, new Cosines().calculate(inputFirstValue));
        double rightPart = new Division().calculate(inputFirstValue, 2);
        return leftPart - rightPart;
    }
}
