package thema5.arrays;

import java.util.Scanner;

import utils.IO;

public class ZinsBerechnung {

	public static void main(String[] args) {
		
		Scanner scanner1 = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);

		double kapital;
		double zins;
		
		System.out.println("Geben Sie den Zinssatz ein.");
		zins = scanner1.nextDouble();
		System.out.println("Zinsrate beträgt " + zins);
		
		System.out.println("Geben Sie das anzulegende Kapital ein.");
		kapital = scanner2.nextDouble();
		System.out.println("Anzulegendes Kapital beträgt " + kapital + " Euro.");
		
		int year = 2025;
		
		do {
			kapital = kapital + kapital * zins;
			year = year + 1;
			System.out.println("Kaptial im Jahr " + year + " beträgt " + IO.round(kapital, 2));
		} while (year < 2100);
		
		System.out.println("Das war's.");
		scanner1.close();
		scanner2.close();
		
	}
}
