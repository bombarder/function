package com.makarov.unary;

import com.makarov.service.Function;

public class Sinus extends Function {

    public double calculate(double inputFirstValue, double inputSecondValue) {
        return 0;
    }

    public double calculate(double inputValue) {
        return Math.sin(inputValue);
    }
}
