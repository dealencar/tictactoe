package com.claudio;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        Plateau plateau = new Plateau();
        GameLogic gameLogic = new GameLogic();
        int tour = 0;
        int player = 0;
        int[] move = new int[2];
        boolean isGameFinished = false;

        while(!isGameFinished){
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
            tour += 1;
            isGameFinished = gameLogic.isGameFinished(move, player);
        }
        try {
        	System.in.available();
        } catch (IOException e) {
        	// TODO Auto-generated catch block
        	e.printStackTrace();
        }
        in.close();
        System.out.println("Player "+ player + " wins!");
    }
}
