package Boucles;

import java.util.Scanner;
import java.util.Random;

public class Exercice {
	
	public static void main(String[] args) {
		
		/* L'utilisateur doit deviner un nombre entre 1 et 1000 (un nombre secret générer par l'ordinateur)
			On va donc demander à l'utilisateur de trouver ce nombre secret. 
			Tant qu'il n'a pas trouver ce nombre on lui demandera encore et encore, jusqu'à ce qu'il le trouve
			
			Supposons que le nombre recherche est 244 
			L'application demandera à l'utilisateur de trouver ce nombre 244.
			Si l'utilisateur entre 29, l'application lui dira que le nombre qu’il a rentré est trop petit
			Si l'utilisateur entre 532, l'application lui dira que le nombre qu’il a rentré est trop grand
			Ainsi de suite jusqu'à ce que l'utilisateur affine son résultat, et trouve le nombre recherché
			On lui indiquera, aussi en combien de coup il a trouvé le nombre, en 1 coup (il trop fort), en 3 coups, ou 14 coups

		 */
		
				
				 Scanner input = new Scanner(System.in);
				 Random obj = new Random();
				
			
					int nbr = obj.nextInt(1000);
					int essai = 1;
		            int compteur = 1;
				
		           System.out.println("Nombre aléatoire : " + nbr);
					
		
                
                do {
                        System.out.print("Renseignez un nombre entre 0 et 1000 : ");
                        essai = input.nextInt();
                        if(essai < 0 || essai > 1000 ) { System.out.println("le chiffre doit être compris entre 0 et 1000");}
                        else if (essai == nbr) {System.out.println("Bravo! " + "Vous avez trouvé en " + compteur + " coup(s)" );}
                        else if (essai > nbr) {System.out.println("Le nombre rentré est trop grand");}
                        else if (essai < nbr) {System.out.println("Le nombre rentré est trop petit");}
                        else  {System.out.println("Recommence");}
                        
                        compteur ++;
                	}  
                 
                while (essai != nbr);
                
                      
            
		
	}
	
}
