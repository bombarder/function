package com.makarov;

public abstract class BinaryElementExp extends Function {

    double secondArg;

    @Override
    public String toString() {
        return getClass().getSimpleName() + " of " + firstArg + " " + secondArg + " executed with the result: " + result;
    }
}