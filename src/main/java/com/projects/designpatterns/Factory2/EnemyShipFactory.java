package com.projects.designpatterns.Factory2;

public class EnemyShipFactory {
    public EnemyShip makeEnemyShip(String newShipType){
        EnemyShip newShip = null;

        if(newShipType.equals("U")){
            return new UFOenemyShip();
        }
        else if(newShipType.equals("R")){
            return new RocketEnemyShip();
        }
        else if(newShipType.equals("B")){
            return new BigUFOenemyShip();
        }
        else {
            return null;
        }
    }
}
