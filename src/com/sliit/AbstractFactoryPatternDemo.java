package com.sliit;

public class AbstractFactoryPatternDemo {

    public static final String SHAPE = "SHAPE";

    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(FactoryProducer.SHAPE);
        Shape shape = shapeFactory.getShape(ShapeFactory.CIRCLE);
        shape.draw();

        FactoryProducer.getFactory(FactoryProducer.SHAPE).getShape(ShapeFactory.RECTANGLE).draw();
        FactoryProducer.getFactory(FactoryProducer.SHAPE).getShape(ShapeFactory.SQUARE).draw();

        FactoryProducer.getFactory(FactoryProducer.COLOR).getColor(ColorFactory.RED).fill();
        FactoryProducer.getFactory(FactoryProducer.COLOR).getColor(ColorFactory.GREEN).fill();
        FactoryProducer.getFactory(FactoryProducer.COLOR).getColor(ColorFactory.BLUE).fill();
    }
}
