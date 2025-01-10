package thema5.arrays.zweidimensional;

public class TicTacToe {

	public static void main(String[] args) {
		
		//Feld initialisieren:
		char[] [] ttt = new char[3] [3];
		
//		System.out.println(ttt.length); // gibt Anzahl der Zeilen aus (3)
		
		for(int i = 0; i < ttt.length; i++) { //Zeilen durchlaufen	
			for (int j = 0; j < ttt[i].length; j++) { // Spalten jeder Zeile durchlaufen
				ttt[i][j] = ' ';
			}
			
		}
		
		System.out.println("Vorher: ");
		spielfeldAusgeben(ttt);

		ttt[0] [0] = 'O';
//		ttt[0] [1] = ' '; // kann man sich sparen, weil alle bereits mit ' ' befüllt sind
		ttt[0] [2] = 'X';
		ttt[1] [0] = 'X';
		ttt[1] [1] = 'X';
		ttt[1] [2] = 'O';
		ttt[2] [0] = 'O';
		
		System.out.println("Nachher: ");
		spielfeldAusgeben(ttt);
	}
	
	public static void spielfeldAusgeben(char[] [] ttt) {
		for(int i = 0; i < ttt.length; i++) { //Zeilen durchlaufen	
			for (int j = 0; j < ttt[i].length; j++) { // Spalten jeder Zeile durchlaufen
				System.out.print(ttt[i][j] + " | ");
			}
			System.out.println();
		}
	}
}
