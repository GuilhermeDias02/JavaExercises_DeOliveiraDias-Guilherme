import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Exercice1 {
    private static int[][] plateau = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
    private static Random rand = new Random();
    private static boolean joueur = rand.nextBoolean();
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        jeu();

    }

    private static void jeu(){
        if(joueur){
            joueur();
            scan.close();
        }
        else{
            ordi();
        }
    }

    private static void joueur(){
        System.out.println("Joueur, c'est a votre tour. Entrez la ligne (0-2), puis la colonne (0-2) :");
        int x = 0;
        int y = 0;

        x = scan.nextInt();
        y = scan.nextInt();

        if(plateau[x][y] != 0){
            System.out.println("Cette case a déjà été jouée!");
            joueur();
        }

        plateau[x][y] = 1;
        printPlateau();

        joueur = false;
        jeu();
    }

    private static void ordi(){
        System.out.println("Tour de l'ordinateur :");
        Random randO = new Random();
        int x = 0;
        int y = 0;

        x = randO.nextInt(3);
        y = randO.nextInt(3);

        if(plateau[x][y] != 0){
            ordi();
        }

        plateau[x][y] = 2;
        printPlateau();

        joueur = true;
        jeu();
    }

    private static void printPlateau(){
        char c = '\u0020';

        System.out.println("-------------");
        System.out.print("| ");
        for (int n : plateau[0]) {
            switch(n){
                case 0:
                    c = '\u0020';
                    break;
                case 1:
                    c = 'X';
                    break;
                case 2:
                    c = 'O';
            }
            System.out.print(c + " | ");
        }
        System.out.print("\r\n");

        System.out.println("-------------");
        System.out.print("| ");
        for (int n : plateau[1]) {
            switch(n){
                case 0:
                    c = '\u0020';
                    break;
                case 1:
                    c = 'X';
                    break;
                case 2:
                    c = 'O';
            }
            System.out.print(c + " | ");
        }
        System.out.print("\r\n");

        System.out.println("-------------");
        System.out.print("| ");
        for (int n : plateau[2]) {
            switch(n){
                case 0:
                    c = '\u0020';
                    break;
                case 1:
                    c = 'X';
                    break;
                case 2:
                    c = 'O';
            }
            System.out.print(c + " | ");
        }
        System.out.print("\r\n");
        System.out.println("-------------");

        verifGO();
    }

    private static void verifGO(){
        // tres moche, a modifier dans le futur
        if(
            ((plateau[0][0] == plateau[0][1] && plateau[0][1] == plateau[0][2]) ||
            (plateau[1][0] == plateau[1][1] && plateau[1][1] == plateau[1][2]) ||
            (plateau[2][0] == plateau[2][1] && plateau[2][1] == plateau[2][2]) ||
            (plateau[0][0] == plateau[1][0] && plateau[1][0] == plateau[1][0]) ||
            (plateau[0][1] == plateau[1][1] && plateau[1][1] == plateau[2][1]) ||
            (plateau[0][2] == plateau[1][2] && plateau[1][2] == plateau[2][2]) ||
            (plateau[0][0] == plateau[1][1] && plateau[1][1] == plateau[2][2]) ||
            (plateau[0][2] == plateau[1][1] && plateau[1][1] == plateau[2][0])) &&
            (plateau[0][0] != 0 && plateau[1][1] != 0 && plateau[2][2] != 0)
        ){
            System.out.println("Game Over");
            System.exit(0);
        }
    }
}
