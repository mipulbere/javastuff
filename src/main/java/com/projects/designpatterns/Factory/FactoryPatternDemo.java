package com.projects.designpatterns.Factory;

public class FactoryPatternDemo {
    public static void main(String[] args){

        //We use the factory pattern when we want a method to return one of several possible classes that share a super class

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("TRIANGLE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("RECTANGLE");
        shape3.draw();
    }
}
