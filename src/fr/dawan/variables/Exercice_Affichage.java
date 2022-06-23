package fr.dawan.variables;

public class Exercice_Affichage {
	
	public static void main(String[] args) {
		
	double x = 5.7;
	int y = 10;
	
	System.out.println("[" + x + "/" + y+ "]");
	
	System.out.printf("[%.1f/%d]%n", x, y);
	
	String str = String.format("[%.1f/%d]%n", x, y);
	System.out.println(str);
	
	}
	
	}


    
    
   
