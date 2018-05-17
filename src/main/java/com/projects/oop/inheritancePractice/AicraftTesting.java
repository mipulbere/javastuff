package com.projects.oop.inheritancePractice;

public class AicraftTesting {
    public static void main(String[] args) {
        Airplane lufthansa = new Airplane();
        Helicopter airScooter = new Helicopter();

        lufthansa.findAircraft();
        lufthansa.takeoff();
        lufthansa.fly();
        lufthansa.land();
        lufthansa.serveDrinks();

        airScooter.takeoff();
        airScooter.fly();
        airScooter.hover();
        airScooter.land();
    }
}
