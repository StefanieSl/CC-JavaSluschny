package uebungsaufgaben.telefonbuch;

public class TelefonbuchHauptprogramm {

	public static void main(String[] args) {

		
		Telefonbuch tel = new Telefonbuch();
		
//		tel.kontaktHinzufuegen("Müller", "Karin", "01234567");
//		tel.kontaktHinzufuegen("Meier", "Bill", "05678245");
//		
//		tel.printKontaktliste();

		tel.sucheKontakt("Müller");
	}

}
