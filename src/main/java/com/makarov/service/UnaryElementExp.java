package com.makarov.service;

import com.makarov.service.Function;

public abstract class UnaryElementExp extends Function {

    @Override
    public String toString() {
        return getClass().getSimpleName() + " of " + firstArg + " executed with the result: " + result;
    }
}
