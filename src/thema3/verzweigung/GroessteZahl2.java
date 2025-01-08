package thema3.verzweigung;

import java.util.Scanner;

public class GroessteZahl2 {

	public static void main(String[] args) {

		Scanner scanner1 = new Scanner(System.in);
		System.out.println("1. Zahl: "); 
		int zahl1 = scanner1.nextInt(); 

		Scanner scanner2 = new Scanner(System.in); 
		System.out.println("2. Zahl: "); 
		int zahl2 = scanner2.nextInt(); 

		Scanner scanner3 = new Scanner(System.in); 
		System.out.println("3. Zahl: "); 
		int zahl3 = scanner3.nextInt(); 

		//hier wird keine Switch-Anweisung mehr benötigt...
		
		int groessereZahl1 = Math.max(zahl1, zahl2);
		int groessereZahl2 = Math.max(groessereZahl1, zahl3);
		
		System.out.println("Die größte Zahl ist die " + groessereZahl2);

		scanner1.close(); 
		scanner2.close(); 
		scanner3.close(); 

	}

}
