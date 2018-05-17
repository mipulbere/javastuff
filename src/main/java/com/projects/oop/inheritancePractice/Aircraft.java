package com.projects.oop.inheritancePractice;

import java.util.Scanner;

public class Aircraft {
    int numOfPassengers = 0;
    void fly(){
        System.out.println("The aircraft is flying!");
    }

    void land(){
        System.out.println("Prepare for landing!");
    }

    void takeoff(){
        System.out.println("Prepare for takeoff!");
    }

    int findAircraft() {
        System.out.println("How many passengers will be flying with us today? Max 335");
        Scanner scanner = new Scanner(System.in);
        int numOfPassengers = scanner.nextInt();

        if(numOfPassengers <= 6){
            System.out.println("You can take the helicopter!");
        }
        else if (numOfPassengers > 6 && numOfPassengers <= 335){
            System.out.println("You can take the airplane!");
        }
        else {
            System.out.println("Looks like we'll have to take multiple aircrafts");
        }

        return numOfPassengers;
    }
}
