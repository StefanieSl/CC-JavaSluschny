package oop.thema4.datenstrukturen.tictactoe;

public abstract class AbstractPlayer implements Player {

	public String name;
	public Enum<Symbol> symbol;
	
	// Konstruktor für die Initialisierung
	public AbstractPlayer () {
	}
	
	// Gibt das Symbol des Spielers zurück
	@Override
	public abstract Symbol getSymbol();

	// Gibt an, ob der Spieler menschlich ist
	@Override
	public abstract boolean isHuman();

}
