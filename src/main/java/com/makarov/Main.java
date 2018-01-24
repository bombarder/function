package com.makarov;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Function>functionsList = new ArrayList<Function>();

        Function sinus = new Sinus();
        Function addition = new Addition();
        functionsList.add(sinus);
        functionsList.add(addition);

        for (Function function:functionsList) {
            printIntoConsole(function);
        }
    }

    private static void printIntoConsole(Function function) {
        System.out.println(function);
    }
}
