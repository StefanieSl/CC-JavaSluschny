package oop.thema4.datenstrukturen.tictactoe;

import java.util.Random;

public class ComputerPlayer extends AbstractPlayer {

	public String name;
	public Enum<Symbol> symbol;
	public Random randomRow = new Random();
	public Random randomCol = new Random();
	
	public ComputerPlayer() {
		super();
		this.name = "Computer";
		this.symbol = Symbol.O;
	}
	
	@Override
	public void makeMove(Board board) {
		int row = randomRow.nextInt(GameConfig.boardSize);
		int col = randomCol.nextInt(GameConfig.boardSize);
			
		if (board.makeMove(row, col, getSymbol()) == false) {
			makeMove(board);
		} else {
			System.out.println("Zug ausgeführt.");
		}
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
