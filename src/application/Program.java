package application;

import boardgame.*;
import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		ChessMatch chessMath = new ChessMatch();
		UI.printBoard(chessMath.getPieces());
	}

}
