package Boucles;

public class Boucles_For_Do {

	public static void main(String[] args) {
		/* Boucle FOR s'utilise quand on connait le nombre d'it�ration (le nombre de fois qu'on ex�cute une instruction)
                
				DO-WHILE : 
				 Permet de r�p�ter des instructions tant qu'une condition est v�rifi�e 
				Comme la condition est test�e � la fin, on est sure de passer dans le 
				 bloc d'instruction au moins une fois 

*/
				Scanner input = new Scanner(System.in);
				                int age = 0;
				                
				                do {
				                        System.out.print("Entrer votre age : ");
				                        age = input.nextInt();
				                        if(age <= 0) {
				                                System.out.println("L'age doit �tre positif\n");
				                        }
				                }while(age < 0);
				                
				                System.out.println("Vous avez " + age + " ans");
				                

	}

}
