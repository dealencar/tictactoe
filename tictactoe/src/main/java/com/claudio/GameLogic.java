package com.claudio;

public class GameLogic {
    Plateau plateau;
    GameLogic(){
        this.plateau = new Plateau();
    }

    // return true if move is allowed
    public boolean isMoveLegal(int[] move){
        if(plateau.board[move[0]-1][move[1]-1] != 0){
            return false;
        }
        else{
            return true;
        }
    }

    // TODO
    public boolean isGameFinished(){
        return true;
    }
}
