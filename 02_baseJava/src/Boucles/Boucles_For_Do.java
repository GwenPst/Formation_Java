package Boucles;

public class Boucles_For_Do {

	public static void main(String[] args) {
		/* Boucle FOR s'utilise quand on connait le nombre d'itération (le nombre de fois qu'on exécute une instruction)
                
				DO-WHILE : 
				 Permet de répéter des instructions tant qu'une condition est vérifiée 
				Comme la condition est testée à la fin, on est sure de passer dans le 
				 bloc d'instruction au moins une fois 

*/
				Scanner input = new Scanner(System.in);
				                int age = 0;
				                
				                do {
				                        System.out.print("Entrer votre age : ");
				                        age = input.nextInt();
				                        if(age <= 0) {
				                                System.out.println("L'age doit être positif\n");
				                        }
				                }while(age < 0);
				                
				                System.out.println("Vous avez " + age + " ans");
				                

	}

}
