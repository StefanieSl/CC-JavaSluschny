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

		bank.kontoHinzufuegen(new SparKonto("111111", 3000));
		bank.kontoHinzufuegen(new GiroKonto("222222", 1500));
		bank.kontoHinzufuegen(new SparKonto("333333", 5300));
		bank.kontoHinzufuegen(new GiroKonto("444444", -600));

		bank.zeigeAlleKonten();

		bank.kontoEntfernen("111111");
		bank.kontoEntfernen("333333\n");

		bank.zeigeAlleKonten();

		bank.getKonto("222222");

		bank.getKonto("999999");

	}

}
