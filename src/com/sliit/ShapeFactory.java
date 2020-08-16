package com.sliit;

public class ShapeFactory extends AbstractFactory {

    public static final String CIRCLE    = "CIRCLE";
    public static final String SQUARE    = "SQUARE";
    public static final String RECTANGLE = "RECTANGLE";

    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {

        if (shape.equals(CIRCLE)) {
            return new Circle();
        } else if(shape.equals(SQUARE)) {
            return new Square();
        } else if (shape.equals(RECTANGLE)) {
            return new Rectangle();
        }

        return null;
    }
}
