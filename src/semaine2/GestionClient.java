package semaine2;

import java.util.Scanner;

public class GestionClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Déclarer l'objet client ici
        ex: Client moh = new Client();
        */

        //La Boucle DO-WHILE
        String userName = ""; //affecter le ID du client ici
        String passWord = ""; //affecter le mot de passe du client ici
        //ex: String userName = moh.id;
        boolean condition = false;

        do{
            System.out.print("user name: ");
            String userInput = sc.next();
            System.out.print("password: ");
            String passwordInput = sc.next();
            if(userInput.equals(userName) && passwordInput.matches(passWord)){
                condition = true;
                System.out.println("Welcome "+ userName);
                //faite appel a la méthode myInfo dans l'objet Client
                //ex: moh.myInfo();
            }else{
                System.out.println("access denied");
            }

        }while(!condition);

    }
}
