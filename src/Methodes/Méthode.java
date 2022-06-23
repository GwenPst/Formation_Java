package Methodes;

public class Méthode {
	
	//Méthode 
	//Méthode : Un ensemble d'instruction réutilisable - eviter de repeter du code 
	//Déclarer une méthode : 
	//Visibilité[mot-clé] type-retour nom-méthode(param){instructions}
	 
	public static void main(String[] args) {
	                int tab[] = {14, 12, 8, 18};
	                afficher();
	                afficher(tab);
	        }
	        
	        
	        /**
	         * Methode afficher 
	         * void ==> Si aucune valeur n'est retournée, on utilise le pseudo-type void
	         */
	        public static void afficher() {
	                System.out.println("Methode afficher");
	        }
	        
	        /**
	         * Methode afficher 
	         * Affiche les éléments d'un tableau
	         * @param tab
	         */
	        public static void afficher(int[] tab) {
	                for(int item: tab) {
	                        System.out.print(item + " ");
	                }
	        }

}
