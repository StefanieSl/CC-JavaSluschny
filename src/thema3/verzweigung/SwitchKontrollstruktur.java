package thema3.verzweigung;

import java.util.Scanner;

public class SwitchKontrollstruktur {

	public static void main(String[] args) {
		
		//Aufgabe 1.1.2; ohne "break" werden die nachfolgenden Cases ebenfalls ausgelöst. 

		Scanner scanner = new Scanner(System.in);
		System.out.println("Geben Sie eine Zahl ein"); 

		int zahl = scanner.nextInt(); 

		switch(zahl) { 
			case 0: 
			case 1: 
			case 2: 
			case 3: 
				System.out.println("Bereich Null bis Drei"); 
			break; 

			case 4: 
			case 5: 
			case 6: 
			case 7: 
				System.out.println("Bereich Vier bis Sieben"); 
			break; 

			case 8: 
			case 9: 
				System.out.println("Bereich Acht bis Neun"); 
			break; 

			default: 
				System.out.println("Außerhalb des Bereiches"); 
			break; 
		} 

		scanner.close(); 

	}

}
