package com.makarov.service;

import com.makarov.unary.Constant;

public class Argument extends Function {

    public double calculate(double inputValue) {
        return inputValue;
    }

    public Function diff() {
        return new Constant(1);
    }

    @Override
    public String toString() {
        return "x";
    }
}
