package oop.thema1.grundlagen.bank;

public class DarlehensVertrag {

	private String vertragId;
	private Kunde kreditnehmer;
	private double kreditbetrag;
	private double zinssatz;
	private int laufzeit;

	// Konstruktor:
	public DarlehensVertrag(String vertragId, Kunde kreditnehmer, double kreditbetrag, double zinssatz, int laufzeit) {
		super();
		this.vertragId = vertragId;
		this.kreditnehmer = kreditnehmer;
		this.kreditbetrag = kreditbetrag;
		this.zinssatz = zinssatz;
		this.laufzeit = laufzeit;
	}

	// Methoden:
	public static double berechneMonatlicheRate(double kreditbetrag, double zinssatz) {
		zinssatz = zinssatz * 0.01;
		return (kreditbetrag + kreditbetrag * zinssatz) / 12;
	}

	@Override
	public String toString() {
		return "Vertrags-ID: " + vertragId + ", Kreditnehmer: " + kreditnehmer.getNameKD() + "\nKreditbetrag: "
				+ kreditbetrag + " EUR, Zinssatz: " + zinssatz + " %, Laufzeit: " + laufzeit + " Monate";
	}

	// Getters & Setters:
	public String getVertragId() {
		return vertragId;
	}

	public void setVertragId(String vertragId) {
		this.vertragId = vertragId;
	}

	public Kunde getKreditnehmer() {
		return kreditnehmer;
	}

	public void setKreditnehmer(Kunde kreditnehmer) {
		this.kreditnehmer = kreditnehmer;
	}

	public double getKreditbetrag() {
		return kreditbetrag;
	}

	public void setKreditbetrag(double kreditbetrag) {
		this.kreditbetrag = kreditbetrag;
	}

	public double getZinssatz() {
		return zinssatz;
	}

	public void setZinssatz(double zinssatz) {
		this.zinssatz = zinssatz;
	}

	public int getLaufzeit() {
		return laufzeit;
	}

	public void setLaufzeit(int laufzeit) {
		this.laufzeit = laufzeit;
	}
}
