package com.makarov;

import com.makarov.binary.*;
import com.makarov.service.Argument;
import com.makarov.service.Function;
import com.makarov.unary.*;

public class Main {
    public static void main(String[] args) {

        Function addition = new Addition();
        addition.leftParameter = new Sinus();
        addition.rightParameter = new Cosines();
        addition.leftParameter.leftParameter = new Exponent();
        addition.leftParameter.leftParameter.leftParameter = new Argument();
        addition.rightParameter.leftParameter = new Argument();
        double result = addition.calculate(90);
        System.out.println(result);
    }
}
