package com.makarov.binary;

import com.makarov.service.Function;

public class Addition extends Function {

    public double calculate(double x) {
        return leftParameter.calculate(x) + rightParameter.calculate(x);
    }

//    @Override
//    public String toString() {
//        return "Addition (" + leftParameter.toString() + " + " + rightParameter.toString() + ")";
//    }
}
