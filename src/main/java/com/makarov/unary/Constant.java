package com.makarov.unary;

import com.makarov.service.Function;

public class Constant extends Function {

    private double value;

    public Constant(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Function diff() {
        return new Constant(0);
    }

   @Override
    public String toString() {
        return value + "";
    }
}
