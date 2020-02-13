package chess.Piaces;

import boardgame.Board;
import chess.ChessPiace;
import chess.Color;

public class King extends ChessPiace {

	public King(Board board, Color color) {
		super(board, color);
	
	}
	
	@Override
	public String toString(){
		return "K";
		
	}

}
