package thema3.verzweigung;

import java.util.Scanner;

public class SwitchWochentage {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte Tag als Zahl eingeben: "); 

		int tag = scanner.nextInt(); 

		switch (tag) { 

		case 1:
			System.out.println("Heute ist Montag"); 
			break; 

		case 2: 
			System.out.println("Heute ist Dienstag");
			break; 

		case 3: 
			System.out.println("Heute ist Mittwoch"); 
			break; 

		case 4: 
			System.out.println("Heute ist Donnerstag");
			break; 

		case 5: 
			System.out.println("Heute ist Freitag"); 
			break; 

		case 6: 
			System.out.println("Heute ist Samstag"); 
			break; 

		case 7: 
			System.out.println("Heute ist Sonntag"); 
			break; 

		default: 
			System.out.println("Ungültiger Tag"); 

		} 

		scanner.close(); 

	}

}
