package com.projects.oop.abstracts;

public abstract class Animal {
    int nomOfLegs = 4;
    void canRun(){
        System.out.println("It can run!");
    }
    abstract void furColour();
}