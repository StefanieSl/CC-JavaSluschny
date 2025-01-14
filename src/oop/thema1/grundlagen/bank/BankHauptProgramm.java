package oop.thema1.grundlagen.bank;

public class BankHauptProgramm {

	public static void main(String[] args) {

		Bank.setNameBK("Sparkasse");

		Kunde kunde1 = new Kunde("420420", "Spongebob Schwammkopf", "Ananas 1");
		Kunde kunde2 = new Kunde("696969", "Gundula Gause", "Hauptstraße 9000");

		/**
		 * alternativ: Kunde kunde1 = new Kunde(); kunde1.setName("Spongebob
		 * Schwammkopf"); kunde1.setAdresse("Ananas 1");
		 */

		Bankkonto konto1 = new Bankkonto("KontoDESpSc56789", 1000, kunde1);
		Bankkonto konto2 = new Bankkonto("KontoDEGuGa12345", 2000, kunde2);

		Bank.printBankInfo();

		System.out.println("\nKundeninformationen:");
		System.out.println(kunde1);
		System.out.println(kunde2);

		System.out.println("\nKontoinformationen:");
		System.out.println(konto1);
		System.out.println(konto2);

		// Teil 2 - Aktie:
		Aktie aktie1 = new Aktie("AAPL123", "Apple Inc.", 150.0);
		Aktie aktie2 = new Aktie("MSFT456", "Microsoft Corp.", 280.0);
		
		System.out.println("Aktieninformationen:");
		System.out.println(aktie1);
		System.out.println(aktie2);

	}

}
