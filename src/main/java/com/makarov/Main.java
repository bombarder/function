package com.makarov;

import com.makarov.binary.*;
import com.makarov.service.Argument;
import com.makarov.service.Function;
import com.makarov.unary.*;

public class Main {
    public static void main(String[] args) {

//         Binary operation
        Function addition = new Addition();
        addition.leftParameter = new Sinus();
        addition.rightParameter = new Cosines();
        addition.leftParameter.leftParameter = new Exponent();
        addition.leftParameter.leftParameter.leftParameter = new Argument();
        addition.rightParameter.leftParameter = new Argument();
        double result = addition.calculate(90);


//        double leftParam = addition.leftParameter.calculate(90);
//        System.out.println(leftParam);
//
//        double rightParam = addition.rightParameter.calculate(90);
//        System.out.println(rightParam);
//
//        double result = addition.calculate(90);
        System.out.println(result);




        Function division = new Division();
        division.leftParameter = new Argument();
        division.rightParameter = new Argument();

        Function subtraction = new Subtraction();
        subtraction.leftParameter = new Argument();
        subtraction.rightParameter = new Argument();

        Function multiplication = new Multiplication();
        multiplication.leftParameter = new Argument();
        multiplication.rightParameter = new Argument();

        Function power = new Power();
        power.leftParameter = new Argument();
        power.rightParameter = new Argument();

//        print(addition);
//        print(division);
//        print(subtraction);
//        print(multiplication);
//        print(power);

//        Unary operation
        Function polynomial = new Polynomial();
        Function sinus = new Sinus();
        Function cosines = new Cosines();
        Function exponent = new Exponent();
        Function logarithm = new Logarithm();
        Function tangent = new Tangent();
        Function cotangent = new Cotangent();
        Function squareRoot = new SquareRoot();

        polynomial.leftParameter = new Argument();
        sinus.leftParameter = new Argument();
        cosines.leftParameter = new Argument();
        exponent.leftParameter = new Argument();
        logarithm.leftParameter = new Argument();
        tangent.leftParameter = new Argument();
        cotangent.leftParameter = new Argument();
        squareRoot.leftParameter = new Argument();

//        print(sinus);
//        print(cosines);
//        print(exponent);
//        print(logarithm);
//        print(tangent);
//        print(cotangent);
//        print(squareRoot);
    }

    private static void print(Function function) {
        System.out.println(function.toString());
    }
}
