package com.claudio;

public class Plateau {
    static int[][] board;
    Plateau(){
        Plateau.board = new int[][]{{0,0,0},
                                {0,0,0},
                                {0,0,0}};
    }
    
    // func displays the game board
    public void afficherPlateau(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(board[i][j] == 1){
                    System.out.print(" X ");
                }
                else if(board[i][j] == 2){
                    System.out.print(" O ");
                }
                else{
                    System.out.print(" _ ");
                }
            }
            System.out.println();
            System.out.println();
        }
    }
    // func update the board
    public void update(int[] move, int joueur){
        board[move[0]-1][move[1]-1] = joueur;
    }

}
