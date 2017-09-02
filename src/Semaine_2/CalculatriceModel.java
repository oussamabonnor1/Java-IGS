package Semaine_2;

import java.util.Scanner;

public class CalculatriceModel {
	//fonction  Somme
	static int Sum(int a, int b) {
		return a + b;
	}

	//fonction  Multiplication
	static int Mul(int a, int b) {
		return a * b;
	}

	//fonction Soustration
	static int Min(int a, int b) {
		return a - b;
	}

	//fonction Division
	static int Div(int a, int b) {
		if (b == 0) {
			System.out.println("....Erreur Tu as divisé sur Zéro");
			return 0;
		}

		else return a / b;
	}

	//fonction puissance
	static double puiss(int a, int b) {
		double c = a;
		for (int i = 1; i <= b; i++) {
			c = a * c;
		}
		return c;
	}

	//fonction modulo
	static int modulo(int a, int b) {
		return a % b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int operation;
		int nbr1, nbr2;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("************************************");
			System.out.println("####### Bienvenue Sur notre Calculatrice #######");
			System.out.println("....pour choisir l'addition tappez -------------> (1)");
			System.out.println("....pour choisir la Multiplication tappez ------> (2)");
			System.out.println("....pour choisir la Soustration tappez ---------> (3)");
			System.out.println("....pour choisir la Division tappez ------------> (4)");
			System.out.println("....pour choisir la Puissance tappez -----------> (5)");
			System.out.println("....pour choisir le Modulo tappez --------------> (6)");
			System.out.println("....pour Quitter calculatrice tappez -----------> (0)");
			System.out.print("....tappez votre Choix svp :");
			operation = sc.nextInt();

			switch (operation) {

				case 1:
					System.out.println("....tu as choisis l'addition");
					System.out.print("....tappez le premier nombre :");
					nbr1 = sc.nextInt();
					System.out.print("....tappez le dexiéme nombre :");
					nbr2 = sc.nextInt();
					System.out.println("....la somme des nombres est :" + Sum(nbr1, nbr2));
					break;

				case 2:
					System.out.println("....tu as choisis la Multiplication ");
					System.out.print("....tappez le premier nombre :");
					nbr1 = sc.nextInt();
					System.out.print("....tappez le dexiéme nombre :");
					nbr2 = sc.nextInt();
					System.out.println("....la Multiplication des nombres est :" + Mul(nbr1, nbr2));
					break;

				case 3:
					System.out.println("....tu as choisis la Soustraction ");
					System.out.print("....tappez le premier nombre :");
					nbr1 = sc.nextInt();
					System.out.print("....tappez le dexiéme nombre :");
					nbr2 = sc.nextInt();
					System.out.println("....la Soustraction des nombres est :" + Min(nbr1, nbr2));
					break;

				case 4:
					System.out.println("....tu as choisis la Division ");
					System.out.print("....tappez le premier nombre :");
					nbr1 = sc.nextInt();
					System.out.print("....tappez le dexiéme nombre :");
					nbr2 = sc.nextInt();
					System.out.println("....la Division des nombres est :" + Div(nbr1, nbr2));
					break;
				case 5:
					System.out.println("....tu as choisis la Puissance ");
					System.out.print("....tappez le nombre :");
					nbr1 = sc.nextInt();
					System.out.print("....tappez la puissance :");
					nbr2 = sc.nextInt();
					System.out.println("....le resultat de la puissance est :" + puiss(nbr1, nbr2));
					break;
				case 6:
					System.out.println("....tu as choisis le Modulo ");
					System.out.print("....tappez le premier nombre :");
					nbr1 = sc.nextInt();
					System.out.print("....tappez le dexiéme nombre :");
					nbr2 = sc.nextInt();
					System.out.println("....le Reste est :" + modulo(nbr1, nbr2));
					break;

				case 0:
					System.out.println("....tu as Quitter la calculatrice au revoir");
					break;
				default:
					System.out.println("....le choix est hors l'intervalle [0..6] essayer");
			}
		} while (operation != 0);
	}
}