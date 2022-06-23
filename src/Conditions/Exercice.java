package Conditions;

import java.util.Scanner;

public class Exercice {

	public static void main(String[] args) {
		/*
		 * Vérifier si l'année donnée par l'utilisateur est bissextile ou non
			Année bissextile :  c'est une année spéciale contenant un jour supplémentaire, (29 février) ; soit un total de 366 jours dans une année. 
			Une année est considérée comme une année bissextile 
			-          Si l'année est divisible par 4 et non divisible par 100 ;
			-          Ou Si l'année est divisible par 400 (« divisible » signifie que la division donne un nombre entier, sans reste (c'est à dire le reste égale à zéro)).
			Un nombre entier est divisible par un autre quand le résultat est un entier sans reste (c'est à dire le reste égale à zéro)
			Par exemple, 21 est divisible par 3 ; 22 ne l’est pas, car le reste est 1.
		 */
		
		  Scanner input = new Scanner(System.in);
		  
		  int annee;
	        
	        System.out.print("Saisir l'année : ");
	        annee = input.nextInt();
	        
	        if (annee <= 0) 
	        	{System.out.println("Renseignez un chiffre supérieur à 0");}
	        else if((annee % 4 == 0) && (annee % 100 != 0) || (annee % 400 == 0)) 
	        	{System.out.println("annee bissextile");}
	        else 
	        	{System.out.println("annee simple");}
	        
		  

	}

}
