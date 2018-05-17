package com.projects.oop.inheritancePractice;

public class Helicopter extends Aircraft {
    int numOfBlades = 2;
    int numOfPassengers = 6;
    ;
    String size = "medium";

    void fly(){
        System.out.println("The helicopter is in the air!");
    }

    void hover(){
        System.out.println("The helicopter is hovering over the water!");
    }
}
