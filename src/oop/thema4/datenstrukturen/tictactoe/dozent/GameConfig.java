package oop.thema4.datenstrukturen.tictactoe.dozent;

import java.util.HashMap;
import java.util.Map;

public interface GameConfig {

	// Konstante für die Spielfeldgröße
	static final int BOARD_SIZE = 3;

	// Für Zuordnung der Symbole zu den Spielern
	Map<String, Symbol> SYMBOLS = new HashMap<String, Symbol>() {{
		put("PLAYER", Symbol.X);
		put("COMPUTER", Symbol.O);
	}};
}
