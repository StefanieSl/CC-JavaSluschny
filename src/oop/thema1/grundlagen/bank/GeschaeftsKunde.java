package oop.thema1.grundlagen.bank;

public class GeschaeftsKunde extends Kunde {

	private String unternehmensName;
	private double jahresUmsatz;
	private String steuernummer;

	// Konstruktor - inkl Superklasse
	public GeschaeftsKunde(String kundenID, String nameKD, String adresse, String unternehmensName, double jahresUmsatz,
			String steuernummer) {
		super(kundenID, nameKD, adresse);
		this.unternehmensName = unternehmensName;
		this.jahresUmsatz = jahresUmsatz;
		this.steuernummer = steuernummer;
	}

	// Konstruktor - Basics
	public GeschaeftsKunde(String kundenID, String unternehmensName, String steuernummer) {
		super(kundenID);
		this.unternehmensName = unternehmensName;
		this.steuernummer = steuernummer;
	}
}
