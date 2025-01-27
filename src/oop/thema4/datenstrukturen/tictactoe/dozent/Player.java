package oop.thema4.datenstrukturen.tictactoe.dozent;

public interface Player {

	Symbol getSymbol(); // gibt Symbol des Spielers zurück (Enum)
	
	void makeMove(Board board); // führt einen Spielzug aus
	
	boolean isHuman(); // gibt an, ob der Spieler menschlich ist
	
}
