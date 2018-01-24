package com.makarov;

import com.makarov.binary.*;
import com.makarov.service.Function;
import com.makarov.unary.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Function>functionsList = new ArrayList<Function>();

        Function addition = new Addition();
        Function subtraction = new Subtraction();
        Function multiplication = new Multiplication();
        Function division = new Division();
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

        functionsList.add(addition);
        functionsList.add(subtraction);
        functionsList.add(multiplication);
        functionsList.add(division);
        functionsList.add(polynomial);
        functionsList.add(constant);
        functionsList.add(sinus);
        functionsList.add(cosines);
        functionsList.add(exponent);
        functionsList.add(power);
        functionsList.add(logarithm);
        functionsList.add(tangent);
        functionsList.add(cotangent);
        functionsList.add(squareRoot);

        for (Function function:functionsList) {
            print(function);
        }
    }

    private static void print(Function function) {
        System.out.println(function);
    }
}
