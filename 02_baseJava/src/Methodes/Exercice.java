package Methodes;

public class Exercice {
	
	

	
	public static void main(String[] args) {
		  double x, y;
		  x = 5;
		  y = 10;
		  double resultat = addition (x, y);
		  System.out.println("x+y = "+resultat);
		
	}

	//M�thode somme qui retourne un double et prend deux param�tres 
	
	public static double addition (double x, double y){
      double addition = x + y; 
      return addition; 
}



}