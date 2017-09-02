package Semaine_2;

import java.util.Scanner;

public class TriCroissant {
    static int[] createTab(int taille) {
        int tentier[] = new int[taille];
        return tentier;
    }


    public static void main(String[] args) {

        int size;
        int var;
        Scanner sc = new Scanner(System.in);
        System.out.print("entrer la taille du tableau :");
        size = sc.nextInt();
        int[] tableau = createTab(size);

        System.out.println("entrer les entiers :");
        for (int j = 0; j < tableau.length; j++) {
            System.out.print("entrer entier numéro " + (j + 1) + " :");
            tableau[j] = sc.nextInt();
        }

        for (int j = 0; j < tableau.length; j++) {
            // la premiere boucle commmence de 0 et arrete a la taille
            //du tableau (parcour complet)

            int lePlusPetitIndex = j; //la case du plus petit entier du tableau
            int lePlusPetit = tableau[j]; // le plus petit entier (le chiffre)

            for (int i = j; i < tableau.length; i++) {
                //la deuxieme boucle commence du l'index de la premiére boucle
                // pour ne pas parcourir les case 2 fois (si non on vas répéter le meme travail 2 fois)

                if(lePlusPetit > tableau[i]) { //si on trouve un chiffre inférieur de notre plus petit alors...
                    lePlusPetit = tableau[i]; // on l'enregistre pour le tester avec le reste
                    lePlusPetitIndex = i; //on enregistre sa place en cas ou il est le plus petit de tout le tableau
                }
            }

            //a la fin on remplace la case acctuel avec le plus petit qu'on a trouvé (LE KESS)
            var = tableau[j];
            tableau[j] = tableau[lePlusPetitIndex];
            tableau[lePlusPetitIndex] = var;
        }
        System.out.println("le tableau est trié croissant :");
        for (int k = 0; k < tableau.length; k++) {
            System.out.println("le case " + (k + 1) + " contient la valeur :" + tableau[k]);
        }

    }

}
