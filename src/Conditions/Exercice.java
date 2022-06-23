package Conditions;

import java.util.Scanner;

public class Exercice {

	public static void main(String[] args) {
		/*
		 * V�rifier si l'ann�e donn�e par l'utilisateur est bissextile ou non
			Ann�e bissextile :  c'est une ann�e sp�ciale contenant un jour suppl�mentaire, (29 f�vrier) ; soit un total de 366 jours dans une ann�e. 
			Une ann�e est consid�r�e comme une ann�e bissextile 
			-          Si l'ann�e est divisible par 4 et non divisible par 100 ;
			-          Ou Si l'ann�e est divisible par 400 (� divisible � signifie que la division donne un nombre entier, sans reste (c'est � dire le reste �gale � z�ro)).
			Un nombre entier est divisible par un autre quand le r�sultat est un entier sans reste (c'est � dire le reste �gale � z�ro)
			Par exemple, 21 est divisible par 3 ; 22 ne l�est pas, car le reste est 1.
		 */
		
		  Scanner input = new Scanner(System.in);
		  
		  int annee;
	        
	        System.out.print("Saisir l'ann�e : ");
	        annee = input.nextInt();
	        
	        if (annee <= 0) 
	        	{System.out.println("Renseignez un chiffre sup�rieur � 0");}
	        else if((annee % 4 == 0) && (annee % 100 != 0) || (annee % 400 == 0)) 
	        	{System.out.println("annee bissextile");}
	        else 
	        	{System.out.println("annee simple");}
	        
		  

	}

}
