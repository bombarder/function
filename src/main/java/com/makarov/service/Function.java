package com.makarov.service;

public class Function {

    public Function leftParameter;
    public Function rightParameter;

    public double calculate(double inputValue) {
        return 0;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + leftParameter.toString();
    }
}
