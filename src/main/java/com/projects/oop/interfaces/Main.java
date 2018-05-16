package com.projects.oop.interfaces;

class Main {
    public static void main(String[] args){
        Audi audiR8 = new Audi();
        Vehicle suv = new Audi();
        System.out.println("Audi R8...");
        audiR8.start();
        audiR8.drive();
        audiR8.park();
        audiR8.stop();
        audiR8.turnOnRadio();
        System.out.println("Playing the station " + audiR8.station);
        System.out.println("License plate: " + audiR8.licensePlate);
        System.out.println("Audi R8 can reach a max speed of: " + audiR8.maxSpeed);
        System.out.println("Audi suv...");
        suv.drive();
        System.out.println("License plate: " + suv.licensePlate);
        System.out.println("The Audi suv can reach a max speed of: " + suv.maxSpeed);

        System.out.println("Referring to the object instances using the interface (the parameter of the driveCar method is Vehicle vehicle)");
        Driver.driveCar(audiR8);
        Driver.driveCar(suv);

    }
}
