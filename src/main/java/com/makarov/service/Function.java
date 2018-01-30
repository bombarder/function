package com.makarov.service;

public abstract class Function {

    public Function leftParameter;
    public Function rightParameter;

    public double calculate(double inputValue) {
        return 0;
    }

    public abstract Function diff();
}
