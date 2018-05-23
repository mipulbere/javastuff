package com.projects.designpatterns.Factory;

public class ShapeFactory {
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }

        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }

        else if (shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }

        else if(shapeType.equalsIgnoreCase("TRIANGLE")){
            return new Triangle();
        }
        return null;
    }
}
