package thema3.verzweigung;

import java.util.Random;

public class Zufallszahlen {

	public static void main(String[] args) {
		
		Random random = new Random();
		int zufallsZahl = 1 + random.nextInt(100); // damit Zahlen von 1 bis 100 (statt von 0 bis 99)

		System.out.println("Die Zufallszahl ist: " + zufallsZahl);
	}

}
