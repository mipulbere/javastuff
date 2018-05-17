package com.projects.oop.abstractPractice;

class AbstarctTesting {
    public static void main(String[] args){
        Animal redFox = new Fox();
        Fox whiteFox = new Fox();
        Panther baghira = new Panther();

        baghira.canRun();
        baghira.furColour();
        baghira.habitat();

        whiteFox.prey();
        redFox.furColour();
        redFox.canRun();
    }
}
