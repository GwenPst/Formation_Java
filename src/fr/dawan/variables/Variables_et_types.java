package fr.dawan.variables;

public class Variables_et_types {

	public static void main(String[] args) {
	//Déclaration d'une variable : Type (char / int / byte / ...) nom_variable = valeur;
	
	// Type caractère
	char c = 'a';
	System.out.println(c);
	
	//Type entier
	byte b = 1;
	short s = 2;
	int i = 3;
	long l = 4;
	
	long l2 = 100L;
	
	long l3 = 1_000_000_000;
	System.out.println(l3);
	
	// type float
	double d = 5.8;
	// il faut suffixer la variable par F pour les types float;
	float f = 1.32F;
	
	boolean bool = true;
	
	// Type complexe
	String str = "Dawan";
	int[] tab = {200, 300, 50};

}}
