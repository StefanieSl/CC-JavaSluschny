package oop.thema3.schnittstellen.tier;

public class Hauptprogramm {

	public static void main(String[] args) {

		// Nutzung des Interface 'Tier' --> es werden nur die Methoden von 'Tier' übernommen
		Tier meineKatze = new Katze();
		meineKatze.fressen();
		meineKatze.laufen();

		Tier meinHase = new Hase();
		meinHase.fressen();
		meinHase.laufen();
		
	}

	
}
