package com.projects.oop.abstractPractice;

public abstract class Animal {
    int nomOfLegs = 4;
    void canRun(){
        System.out.println("It can run!");
    }
    abstract void furColour();
}