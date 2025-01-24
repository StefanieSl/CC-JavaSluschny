package oop.thema4.datenstrukturen.tictactoe;

import java.util.HashMap;

public interface GameConfig {
	
	// Konstante für die Spielfeldgröße
	static final int boardSize = 3;
	
	// Für Zuordnung der Symbole zu den Spielern
	HashMap<String, Symbol> spielerSymbole = new HashMap<>() {{
		put("Human", Symbol.X);
		put("Computer", Symbol.O);
	}};
}
