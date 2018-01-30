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

        Function f4 = new Exponent();
        f4.leftParameter = new Exponent();
        f4.leftParameter.leftParameter = new Argument();

        Function f5 = f4.diff();
        System.out.println(f4);
        System.out.println(f5);

    }
}
