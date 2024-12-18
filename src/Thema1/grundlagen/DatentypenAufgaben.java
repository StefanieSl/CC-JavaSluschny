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
		
		//Rechen-Operationen
		
		int addition(int zahl1, int zahl2) {
			int ergebnis = zahl1 + zahl2;
			System.out.println(ergebnis);
		}
		
	}

}
