package Tableaux_statiques;

import java.util.Arrays;

public class Exercice_tableau {

	public static void main(String[] args) {

			double[] notes = {8.5, 9.5, 12.5, 18};
			
			for(int i=0; i < notes.length; i++){
				 
				System.out.print(notes[i] + " ");
			}
			
			double[] copie = Arrays.copyOf(notes, 5);
			
	        copie[2] = 11;
	        copie[3] = 12.5;
	        copie[4] = 18;
	  
	        System.out.println("\nNouveau tableau:");
	        for (int i = 0; i < copie.length; i++)
	            System.out.print(copie[i] + " ");
			
			}
		
		

	}


