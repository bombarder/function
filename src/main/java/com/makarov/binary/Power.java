package com.makarov.binary;

import com.makarov.service.Function;

public class Power extends Function {

    public double calculate(double inputFirstValue, double inputSecondValue) {
        return Math.pow(inputFirstValue, inputSecondValue);
    }

    public double calculate(double inputValue) {
        return 0;
    }
}
