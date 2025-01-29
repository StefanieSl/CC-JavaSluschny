package uebungsaufgaben.telefonbuch;

public class Kontakt {

	private String vorname;
	private String nachname;
	private String telefonnummer;

	
	public Kontakt (String nachname, String vorname, String telefonnummer) {
		this.nachname = nachname;
		this.vorname = vorname;
		this.telefonnummer = telefonnummer;
	}
	
	@Override
	public String toString() {
		return nachname + ", " + vorname + ": " + telefonnummer;
	}
	
	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getTelefonnummer() {
		return telefonnummer;
	}

	public void setTelefonnummer(String telefonnummer) {
		this.telefonnummer = telefonnummer;
	}
}
