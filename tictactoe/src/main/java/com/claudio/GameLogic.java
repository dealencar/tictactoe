package com.claudio;

public class GameLogic {
    Plateau plateau;
    GameLogic(){
        Plateau.plateau = new Plateau();
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
    public boolean isGameFinished(int[] move, int player){
        boolean checkRow = true;
        boolean checkCol = true;
        for(int i = 0; i < 3; i++){
            if(Plateau.board[move[0]-1][i] != player){
                checkCol = false;
            }
            if(Plateau.board[i][move[1]-1] != player){
                checkRow = false;
            }
        }
        return checkCol || checkRow;
    }
}
