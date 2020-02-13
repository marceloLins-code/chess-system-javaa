package chess.Piaces;

import boardgame.Board;
import chess.ChessPiace;
import chess.Color;

public class Rook extends ChessPiace {

	public Rook(Board board, Color color) { // invoca super classe
		super(board, color);
		
	}
	
	@Override
	public String toString(){
		return "R";
		
	}
	
	
	

}
