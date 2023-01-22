package com.claudio;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        Plateau plateau = new Plateau();
        GameLogic gameLogic = new GameLogic();
        int tour = 0;
        int player;
        int[] move = new int[2];

        while(gameLogic.isGameFinished()){
            if(tour % 2 == 0){ 
                player = 1;
            }
            else{
                player = 2;
            }
            do{
                System.out.println("Joueur " + player);
                move[0] = in.nextInt();
                move[1] = in.nextInt();
            }while(!gameLogic.isMoveLegal(move));
            plateau.update(move, player);
            plateau.afficherPlateau();
        }
    }
}
