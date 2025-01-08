package thema3.verzweigung;

import java.util.Scanner;

public class Geldautomat {

	public static void main(String[] args) {
		
		double guthaben = 346.14;
		System.out.println("Ihr Guthaben beläuft sich auf " + guthaben + " Euro.");
		
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Wie viel Geld möchten Sie abheben?"); 
		double abheben = scanner.nextDouble(); 

		if (abheben <= guthaben) {
			System.out.println("Es werden " + abheben + " Euro ausgezahlt.");
			guthaben = guthaben - abheben;
			System.out.println("Ihr Guthaben beträgt nun " + guthaben + " Euro");
		} else {
			System.out.println("Keine Auszahlung möglich! Der angegebene Betrag übersteigt Ihr Guthaben.");
		}
		
		scanner.close();
	}

}
