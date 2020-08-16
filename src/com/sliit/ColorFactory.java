package com.sliit;

public class ColorFactory extends AbstractFactory {
    public static final String RED   = "RED";
    public static final String GREEN = "GREEN";
    public static final String BLUE  = "BLUE";

    @Override
    public Color getColor(String color) {

        if (color.equals(RED)) {
            return new Red();
        } else if(color.equals(GREEN)) {
            return new Green();
        } else if (color.equals(BLUE)) {
            return new Blue();
        }

        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
