package com.projects.oop.interfacePractice;

public class Audi implements Vehicle, Radio {
    public void drive(){
        System.out.println("The Audi is driving!");
    }

    public void stop(){
        System.out.println("The Audi is stopping!");
    }

    public void park(){
        System.out.println("The Audi is parking!");
    }

    public void turnOnRadio(){
        System.out.println("Turning on the Radio!");

    }

}