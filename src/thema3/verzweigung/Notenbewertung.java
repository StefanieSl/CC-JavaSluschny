package thema3.verzweigung;

import java.util.Scanner;

public class Notenbewertung {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Geben Sie Ihre Note ein: ");
		double note = scanner.nextDouble();
		
		if (note <= 1.4) {
			System.out.println("Die Bewertung ist: sehr gut.");
		} else if (note <= 2.4) {
			System.out.println("Die Bewertung ist: gut.");
		} else if (note <= 3.4) {
			System.out.println("Die Bewertung ist: befriedigend");
		} else if (note <= 4.0) {
			System.out.println("Die Bewertung ist: ausreichend");
		} else if (note <= 5.0) {
			System.out.println("Die Bewertung ist: nicht bestanden");
		} else {
			System.out.println("Ungültige Note");
		}
		
		scanner.close();

	}

}
