package Thema1.grundlagen;

public class Datentypen2 {

	public static void main(String[] args) {
		
		//Tabelle:
		System.out.println("Zahl 1\t\tZahl 2 \t\t Ergebnis");
		System.out.println("10\t\t30\t\t40");
		
		//Boolean true/false:
		boolean isSunny = false;
		
		if(!isSunny) {
			System.out.println("It's sunny!");
		} else {
			System.out.println("It isn't sunny!");
		}
		
		//Boolean true/false mit Operatoren
		int alter = 17;
		
		if(alter > 12 && alter < 19) {
			System.out.println("Sie sind Teenager.");
		}
		
		//Tenäre Operatoren
		
		int age = 50;
		
		String ausgabe = (age >= 18) ? "volljährig" : "nicht volljährig";
		System.out.println(ausgabe);
		
		
		//Type Casting / Typ Konversion
		int x = 10;
		long y = x;
		System.out.println("Wert von x: " + x);
		System.out.println("Wert von y: " + y);
		
	}

}
