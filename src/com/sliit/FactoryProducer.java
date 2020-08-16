package com.sliit;

public class FactoryProducer {

    public static final String SHAPE = "SHAPE";
    public static final String COLOR = "COLOR";

    public static AbstractFactory getFactory(String factory) {
        if (factory.equals(SHAPE)) {
            return new ShapeFactory();
        } else if (factory.equals(COLOR)) {
            return new ColorFactory();
        }
        return null;
    }
}
