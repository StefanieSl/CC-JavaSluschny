package oop.thema1.grundlagen.bank;

public class Kunde {

	private String kundenID;
	private String nameKD;
	private String adresse;

	// Konstruktor:
	public Kunde(String kundenID, String nameKD, String adresse) {
		this.kundenID = kundenID;
		this.nameKD = nameKD;
		this.adresse = adresse;
	}

	// toString-Methode:
	@Override
	public String toString() {
		return "KundenID:" + kundenID + "Kunde: " + nameKD + ", Adresse: " + adresse;
	}

	// Getter & Setter:
	public String getKundenID() {
		return kundenID;
	}

	public void setKundenID(String kundenID) {
		this.kundenID = kundenID;
	}

	public String getNameKD() {
		return nameKD;
	}

	public void setNameKD(String nameKD) {
		this.nameKD = nameKD;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
}
