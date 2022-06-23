package Entrees_sorties;

import java.util.Scanner;

public class Classe_Scanner {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		int n = 0;
		double var1 = 0.0;
		
		System.out.print("Renseignez un nombre entier :");
		n = input.nextInt();
		System.out.println ("Le carré de " + n + " est " + n*n);
		
		

	}

}
