package Conditions;

import java.util.Scanner;

public class If_Else {

	public static void main(String[] args) {
	
	Scanner input = new Scanner (System.in);
	int nbre = 0;
	
	System.out.print("Entrez un nombre s'il vous plait :");
	nbre = input.nextInt();
	
	if (nbre > 0) {System.out.println ("Le nombre est positif");}
	else { System.out.println("Le nombre est égal à zéro ou négatif");}
	
	}

}
