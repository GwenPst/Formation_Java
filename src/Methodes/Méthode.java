package Methodes;

public class M�thode {
	
	//M�thode 
	//M�thode : Un ensemble d'instruction r�utilisable - eviter de repeter du code 
	//D�clarer une m�thode : 
	//Visibilit�[mot-cl�] type-retour nom-m�thode(param){instructions}
	 
	public static void main(String[] args) {
	                int tab[] = {14, 12, 8, 18};
	                afficher();
	                afficher(tab);
	        }
	        
	        
	        /**
	         * Methode afficher 
	         * void ==> Si aucune valeur n'est retourn�e, on utilise le pseudo-type void
	         */
	        public static void afficher() {
	                System.out.println("Methode afficher");
	        }
	        
	        /**
	         * Methode afficher 
	         * Affiche les �l�ments d'un tableau
	         * @param tab
	         */
	        public static void afficher(int[] tab) {
	                for(int item: tab) {
	                        System.out.print(item + " ");
	                }
	        }

}
