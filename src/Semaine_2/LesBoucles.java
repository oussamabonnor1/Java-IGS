package Semaine_2;

import java.util.Scanner;

public class LesBoucles {
    public static void main(String[] args) {

        //La boucle WHILE
        Scanner sc = new Scanner(System.in);
        int tnombre[] = {2, 10, 8, 7, 1, 4, 6, 9, 1};
        int i = 0;
        boolean condition = false;
        while (condition == false && i < tnombre.length) {
            if (tnombre[i] < 10) {
                System.out.println("la valeur de la case " + (i + 1) + " est: "
                        + tnombre[i]);
                i++;
            } else {
                condition = true;
            }
        }
        System.out.println("FIN DU PRGM");

        //La Boucle DO-WHILE
        String userName = "oussama";
        String passWord = "azerty";
        condition = false;

        do{
            System.out.print("user name: ");
            String userInput = sc.next();
            System.out.print("password: ");
            String passwordInput = sc.next();
            if(userInput.equals(userName) && passwordInput.matches(passWord)){
                condition = true;
                System.out.println("Welcome "+ userName);
            }else{
                System.out.println("access denied");
            }

        }while(!condition);

        //Boucle FOR
        int nombre[] = new int[5];
        for (int j = 0; j < nombre.length; j++) {
            System.out.println("rempliser la case numero "+(j+1));
            nombre [j] = sc.nextInt();
        }
        for (int j = 0; j < nombre.length; j++) {
            System.out.println("la case numero "+(j+1)+" contien "+(tnombre[j]));
        }
    }
}
