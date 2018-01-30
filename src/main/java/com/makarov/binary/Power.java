package com.makarov.binary;

import com.makarov.service.Function;

public class Power extends Function {

    public double calculate(double x) {
        return Math.pow(x, x);
    }

//    @Override
//    public String toString() {
//        return "Power (" + leftParameter.toString() + " and " + rightParameter.toString() + ")";
//    }
}
