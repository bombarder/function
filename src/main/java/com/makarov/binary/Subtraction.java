package com.makarov.binary;

import com.makarov.service.Function;

public class Subtraction extends Function {

    public double calculate(double inputFirstValue, double inputSecondValue) {
        return inputFirstValue - inputSecondValue;
    }

    public double calculate(double inputValue) {
        return 0;
    }
}
