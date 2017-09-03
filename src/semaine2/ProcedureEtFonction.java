package semaine2;

import java.util.Scanner;

public class ProcedureEtFonction {
    //la declaration d'une procedure ici
    static void info(String nom,int age, int poid, boolean married){
        System.out.println("Votre nom est "+nom+
                "\nvotre age est "+age+
                "\nvotre poid est "+poid);
        if (married) System.out.println("Vous étes marrier");
        else System.out.println("Vous n'etes pas marrier");
    }
    public static void main(String[] args) {
        //procedure
        Scanner sc = new Scanner(System.in);
        System.out.println("enter votre nom");
        String name = sc.next();
        System.out.println("enter votre age");
        int age2 = sc.nextInt();
        System.out.println("enter votre poid");
        int poid2 = sc.nextInt();
        System.out.println("vous etes marrier ? (true/false)");
        boolean married = sc.nextBoolean();
        info(name, age2, poid2,married);

        //fonction
        System.out.println("le resultat de l'addition de 20 et 4 est "
        +addition(20, 4));

    }

    //la declaration d'une procedure ici
    static int addition(int a,int b){
        int c = a+b;
        return c;
    }
}
