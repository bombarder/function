package com.makarov;

import com.makarov.binary.*;
import com.makarov.service.Function;
import com.makarov.unary.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//         Binary operation
        Function addition = new Addition();
        Function subtraction = new Subtraction();
        Function multiplication = new Multiplication();
        Function division = new Division();

//        Unary operation
        Function polynomial = new Polynomial();
        Function constant = new Constant();
        Function sinus = new Sinus();
        Function cosines = new Cosines();
        Function exponent = new Exponent();
        Function power = new Power();
        Function logarithm = new Logarithm();
        Function tangent = new Tangent();
        Function cotangent = new Cotangent();
        Function squareRoot = new SquareRoot();

//          Printout in console
        print(addition);
        print(subtraction);
        print(multiplication);
        print(division);
        print(polynomial);
        print(constant);
        print(sinus);
        print(cosines);
        print(exponent);
        print(power);
        print(logarithm);
        print(tangent);
        print(cotangent);
        print(squareRoot);

    }
    private static double unaryFunctionResolver(Function input, double inputConstant){
        return input.calculate(inputConstant);
    }
    private static double binaryFunctionResolver(Function input, double inputFirstArg, double inputSecondArg){
        return input.calculate(inputFirstArg, inputSecondArg);
    }
    private static void print(Function function){
        System.out.println(function.toString());
    }
}
