package oop.thema1.grundlagen.bank;

public class Transaktion {

	private int transaktionsID;
	private double betrag;
	private String datum;
	private Bankkonto senderKontoID;
	private Bankkonto empfaengerKontoID;
	private String transaktionsart;
	private boolean erfolgreich;

	// Konstruktor:
	public Transaktion(int transaktionsID, double betrag, String datum, Bankkonto senderKontoID,
			Bankkonto empfaengerKontoID, String transaktionsart) {
		this.transaktionsID = transaktionsID;
		this.betrag = betrag;
		this.datum = datum;
		this.senderKontoID = senderKontoID;
		this.empfaengerKontoID = empfaengerKontoID;
		this.transaktionsart = transaktionsart;
		this.erfolgreich = false;
	}

	// Methode Überweisung durchführen
	// Prüfung, ob genug Guthaben; dann Gutschreibung auf Empfängerkonto
	public void ueberweisung() {
		if (senderKontoID.abheben(betrag)) {
			empfaengerKontoID.einzahlen(betrag);
			erfolgreich = true;
			System.out.println("Überweisung erfolgt.\n" + "Sender: " + senderKontoID.getKontonummer() + "\nEmpfänger: "
					+ empfaengerKontoID.getKontonummer() + "\nBetrag: " + betrag);
			this.transaktionsart = "Überweisung";
		} else {
			System.err.println("Überweisung nicht möglich. Zu wenig Guthaben verfügbar.");
		}
	}

	public boolean transaktionErfolgreich() {
		return erfolgreich;
	}
}
