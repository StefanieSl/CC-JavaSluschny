package thema3.verzweigung;

import java.util.Scanner;

public class GroessteZahl1 {

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

		if ((zahl1 > zahl2) && (zahl1 > zahl3)) { 
		System.out.println(zahl1 + " ist die größte Zahl"); 

		} else if ((zahl2 > zahl1) && (zahl2 > zahl3)) { 
		System.out.println(zahl2 + " ist die größte Zahl"); 

		} else { 
		System.out.println(zahl3 + " ist die größte Zahl"); 
		} 

		scanner1.close(); 
		scanner2.close(); 
		scanner3.close(); 

	}

}
