package oop.thema4.datenstrukturen.bank;

public class Hauptprogramm {

	public static void main(String[] args) {

//		// Mit Interfaces:
//		Zinsfaehig spari = new SparKonto("123456", 5300);
//		Ueberziehbar giro = new GiroKonto("654321", -600);
//
//		System.out.println(spari);
//		System.out.println(giro);
//
//		spari.zinsenBerechnen();
//		giro.ueberziehungPruefen();
//
//		System.out.println("Mit Zinsen: " + spari);
//		System.out.println("Mit Gebühren: " + giro);

		Bank bank = new Bank();

		SparKonto spari1 = new SparKonto("111111", 3000);
		GiroKonto giro1 = new GiroKonto("222222", 1500, -500);
		SparKonto spari2 = new SparKonto("333333", 5300);
		GiroKonto giro2 = new GiroKonto("444444", -600, -750);
		
		bank.kontoHinzufuegen(spari1);
		bank.kontoHinzufuegen(giro1);
		bank.kontoHinzufuegen(spari2);
		bank.kontoHinzufuegen(giro2);

		bank.zeigeAlleKonten();

		bank.kontoEntfernen("111111");
		bank.kontoEntfernen("333333");

		bank.zeigeAlleKonten();

		bank.getKonto("222222");

		bank.getKonto("999999");
		
		Bankkonto zufallsKonten = new Bankkonto();
		
		zufallsKonten.randomKonto(5);

	}

}
