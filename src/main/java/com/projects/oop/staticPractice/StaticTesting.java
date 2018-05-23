package com.projects.oop.staticPractice;

public class StaticTesting {
    public static void main(String[] args){
        Instance instance1 = new Instance();
        Instance instance2 = new Instance();
        Instance instance3 = new Instance();
        Instance instance4 = new Instance();

        System.out.println(Instance.numOfInstances);
        //the static variable belongs to the class, not its objects. That's why we get 4 instead of 1, because the variable is shared by all objects of that class

    }
}
