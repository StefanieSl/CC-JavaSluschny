package Thema1.grundlagen;

import java.util.Scanner;

public class Runden1 {

	public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in); 

			System.out.println("Zahl eingeben: "); 

			double zahl = scanner.nextDouble(); 

			// Runden auf 2 Nachkommastellen 

			double zahlGerundet = Math.round(zahl * 100.0) / 100.0; 

			System.out.println("Gerundet: " + zahlGerundet); 

			scanner.close();
			
	} 

}
