package Tableaux_statiques;

public class Déclaration_et_Initialisation {

	public static void main(String[] args) {
	/*	Nous verrons les tableaux statiques et les tableaux dynamiques (collections)
		Un tableau statique à une taille fixe 
		On ne peut pas le modifié une fois déclarée. 
		Un tableau dynamique nous permet de créer des tableaux de taille dynamique 
		Nous pouvons augmenter et diminuer sa taille 
		Ces tableaux ne peuvent contenir que des références vers des objets
		L'alternative aux tableaux statique, sont les tableaux dynamiques
		 

		/*
		 * Nous allons voir les avantages et inconvenients entre l'iteration classique 
		 * l'iteration par valeur (foreach) 
		 * 
		 * Conclusion : Pour modifier une valeur on va l'iteration classique
		 */
		                    
		int[] tab = {200, 330, 50};
		                
		                System.out.println("***********Iteration classique avec la boucle for***********");
		                
		                //La taille du tableau 
		                System.out.println("Taille du tableau : " + tab.length);
		                
		                for(int i = 0; i < tab.length; i++) {
		                        System.out.println(tab[i]);
		                        //tab[i] = 22;
		                }
		                
		        //        System.out.println("tab[2] : " + tab[2]);
		                
		                System.out.println("\n Iteration par valeur avec la boucle FOREACH******");
		                for(int element: tab) {
		                        System.out.println(element);
		                //        element = 22;
		                }
		                
		                System.out.println("tab[2] : " + tab[2]);

	}

}
