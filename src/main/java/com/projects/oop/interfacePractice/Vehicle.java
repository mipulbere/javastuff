package com.projects.oop.interfacePractice;

interface Vehicle {
    //all variables and methods are public even if they aren't specified as being public
    String licensePlate = "Final License Plate";
    int maxSpeed = 323;
    default void start(){
        System.out.println("Starting the vehicle!");
    }
    void drive();
    void stop();
    void park();
}