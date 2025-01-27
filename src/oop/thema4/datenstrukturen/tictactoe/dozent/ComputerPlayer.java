package oop.thema4.datenstrukturen.tictactoe.dozent;

import java.util.Random;

public class ComputerPlayer extends AbstractPlayer {

	private Random random = new Random();

	public ComputerPlayer(String name, Symbol symbol) {
		super(name, symbol);
	}

	@Override
	public void makeMove(Board board) {
		int row, col;

		// do-while, damit der Computer mindestens 1x eine Bewegung ausführt
		do {
			row = random.nextInt(GameConfig.BOARD_SIZE);
			col = random.nextInt(GameConfig.BOARD_SIZE);

		} while (!board.makeMove(row, col, symbol));

		System.out.println(name + " platziert " + symbol + " auf (" + row + ", " + col + ")");
	}

	@Override
	public Symbol getSymbol() {
		return (Symbol) this.symbol;
	}

	@Override
	public boolean isHuman() {
		return false;
	}

}
