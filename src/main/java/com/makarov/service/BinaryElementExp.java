package com.makarov.service;

public abstract class BinaryElementExp extends Function {

    public double secondArg;

    @Override
    public String toString() {
        return getClass().getSimpleName() + " of " + firstArg + " and " + secondArg + " executed with the result: " + result;
    }
}
