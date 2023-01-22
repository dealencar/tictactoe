package com.claudio;

public class GameLogic {
    Plateau plateau;
    GameLogic(){
        this.plateau = new Plateau();
    }

    public boolean isMoveLegal(int[] move){
        return false;
    }
    public boolean isGameFinished(){
        return false;
    }
}
