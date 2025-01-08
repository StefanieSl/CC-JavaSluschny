package Thema1.grundlagen;

public class DatentypenAufgaben {

	public static void main(String[] args) {

		// Variablendeklaration
		int i = 5;
		System.out.println("integer = " + i);
		
		float f = 3.5f;
		System.out.println("float = " + f);
		
		double d = 37.835;
		System.out.println("double = " + d);
		
		char c = '&';
		System.out.println("char = " + c);
		
		boolean b = true;
		System.out.println("bool = " + b);
		
		int num1 = 10;
		int num2 = 3;
		
		int addition = num1 + num2;
		int subtraktion = num1 - num2;
		int division = num1 / num2;
		int modulo = num1 % num2;
		
		System.out.println("Werte: " + num1 + " und " + num2);
		System.out.println("Addition: " + addition);
		System.out.println("Subtraktion: " + subtraktion);
		System.out.println("Division: " + division);
		System.out.println("Modulo: " + modulo);
		
		additionAufgabe(3,2);
		
	}

	//Rechen-Operationen eigene Funktion
	
	public static int additionAufgabe(int zahl1, int zahl2) {
		int ergebnis = zahl1 + zahl2;
		System.out.println(ergebnis);
		return ergebnis;
	}
}
