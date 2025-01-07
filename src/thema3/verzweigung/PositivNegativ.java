package thema3.verzweigung;

import java.util.Scanner;

public class PositivNegativ {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); 
		System.out.println("Geben Sie eine Zahl ein"); 
		int zahl = scanner.nextInt(); 

		
		//Prüfen, ob negativ/positiv:
		
		if (zahl < 0) {
			System.out.println("Negativ");
		} else if (zahl == 0) {
			System.out.println("Null");
		} else {
			System.out.println("Positiv");
		}
			
		//Prüfen, ob gerade/ungerade:
		
		int testzahl = zahl % 2; 

		if (testzahl == 1) {
			System.out.println("Ungerade"); 
		} else { 
			System.out.println("Gerade"); 
		} 

		scanner.close(); 

	}

}
