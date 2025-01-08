package thema5.arrays;

import java.util.Random;

public class RandomProgramm {

	public static void main(String[] args) {
		int [] zufallsZahlen;
		zufallsZahlen = new int[1000];
		
		// Array befüllen
		for(int i = 0; i < zufallsZahlen.length; i++) {
			Random random = new Random();
			zufallsZahlen[i] = 1 + random.nextInt(200);
		}
		
		//Ausgabe
		for(int j = 0; j < zufallsZahlen.length; j++) {
			System.out.print(zufallsZahlen[j] + " ");
		}

	}

}
