package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input; //input c'est la valeur que l'utilisateur choisis dans le menu

        do{
            //Un petit menu pour notre calculatrice
            System.out.println("----Ma Calculatrice----");
            System.out.println("1)- addition");
            System.out.println("2)- soustraction");
            System.out.println("3)- multiplication");
            System.out.println("4)- division");
            System.out.println("0)- Quitter");
            System.out.print("Enter votre choix: ");
            input = sc.nextInt();
            //calculatrice prend (input) comme parametre d'entrer afin de choisir
            //quel operation on doit faire
            calculatrice(input);
        }while(input!= 0);

    }

    //utiliser la procedure calculatrice pour appeller les
    //autre procedures (addition, multiplication...)
    static void calculatrice(int input){

        int a,b; //a et b sont les deux variable entré par l'utilisateur
                 // et utilisé par les procedure (addition..etc) comme parametre d'entrée

        switch(input){
            case 1:
                //appeler addition ici
                break;
            case 2:
                //appeler soustraction ici
                break;
            case 3:
                //appeler multiplication ici
                break;
            case 4:
                //appeler division ici
                break;
            default:
                System.out.println("Au revoir !");
                break;
        }
        System.out.println("\n");
    }
}
