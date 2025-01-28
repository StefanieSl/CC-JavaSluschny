package oop.thema4.datenstrukturen.tictactoe.dozent;

import java.util.Scanner;

public class HumanPlayer extends AbstractPlayer {

	private Scanner scanner = new Scanner(System.in);

	public HumanPlayer(String name, Symbol symbol) {
		super(name, symbol);
	}

	@Override
	public void makeMove(Board board) {

		System.out.println(name + ", bitte gib deine Bewegung (Reihe Spalte) ein: 0 0");
		int row = scanner.nextInt();
		int col = scanner.nextInt();

		while (!board.makeMove(row, col, symbol)) {
			System.out.println("Ungültiger Zug. Versuche es erneut.");
			row = scanner.nextInt();
			col = scanner.nextInt();
		}
	}

	@Override
	public Symbol getSymbol() {
		return (Symbol) this.symbol;
	}

	@Override
	public boolean isHuman() {
		return true;
	}

}
