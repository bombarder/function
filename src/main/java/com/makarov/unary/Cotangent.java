package com.makarov.unary;

import com.makarov.service.Function;

public class Cotangent extends Function {

    public double calculate(double inputFirstValue, double inputSecondValue) {
        return 0;
    }

    public double calculate(double inputValue) {
        return 1/Math.tan(inputValue);
    }
}
