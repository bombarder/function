package com.makarov.service;

public abstract class Function {

    public Function leftParameter;
    public Function rightParameter;

    public abstract double calculate(double inputFirstValue, double inputSecondValue);
    public abstract double calculate(double inputValue);

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
