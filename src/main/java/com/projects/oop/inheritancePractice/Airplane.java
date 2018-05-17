package com.projects.oop.inheritancePractice;

import java.util.Scanner;

public class Airplane extends Aircraft{
    int numOfWings = 2;
    String size = "large";
    int numOfPassengers = 335;

    void fly() {
        System.out.println("The airplane is in the air!");
    }
    void serveDrinks(){
        System.out.println("What would you like to drink?");
        Scanner scanner = new Scanner(System.in);
        String beverage = scanner.nextLine();
        System.out.println("Here is your " + beverage);
    }
}
