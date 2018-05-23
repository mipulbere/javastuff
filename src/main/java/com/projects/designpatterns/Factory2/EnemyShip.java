package com.projects.designpatterns.Factory2;

public abstract class EnemyShip {
    private String name;
    private double amtDamage;

    public String getName(){
        return name;
    }
    public void setName(String newName) {
        name = newName;
    }

    public double getDamage() {
        return amtDamage;
    }
    public void setDemage(double newDamage) {
        this.amtDamage = newDamage;
    }

    public void followHeroShip(){
        System.out.println(getName() + " is following the hero!");
    }

    public void displayEnemyShip(){
        System.out.println(getName() + " is on the screen!");
    }

    public void enemyShipShoot(){
        System.out.println(getName() + " is attacking and doing " + getDamage() +" damage");
    }
}
