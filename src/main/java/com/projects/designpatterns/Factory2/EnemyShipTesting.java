package com.projects.designpatterns.Factory2;

import java.util.Scanner;

public class EnemyShipTesting {
    public static void main(String[] args){
       EnemyShipFactory shipFactory = new EnemyShipFactory();
       EnemyShip theEnemy = null;

       Scanner userInput = new Scanner(System.in);
       System.out.println("What enemy ship would you like to deploy? (U/R/B) ");

       if (userInput.hasNextLine()){
           String typeOfShip = userInput.nextLine();
           theEnemy = shipFactory.makeEnemyShip(typeOfShip);
       }
       if (theEnemy != null){
           doStuffEnemy(theEnemy);
       }
       else {
           System.out.println("Please enter U, R or B");
       }
    }

    public static void doStuffEnemy(EnemyShip anEnemyShip){
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoot();

    }
}
