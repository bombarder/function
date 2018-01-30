package com.makarov.unary;

import com.makarov.service.Function;

public class SquareRoot extends Function {

    public double calculate(double x) {
        return Math.sqrt(x);
    }

//    @Override
//    public String toString() {
//        return "SquareRoot (" + leftParameter.toString() + ")";
//    }
}
