package com.makarov;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Function>functionList = new ArrayList<Function>();

        Function sinus = new Sinus(90);
        functionList.add(sinus);

        for (Function function:functionList) {
            printIntoConsole(function);
        }
    }

    private static void printIntoConsole(Function function) {
        System.out.println(function);
    }
}
