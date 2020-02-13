package chess;

import boardgame.Board;
import boardgame.Piace;

public class ChessPiace extends Piace{
	private Color color;
	
	

	public ChessPiace(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	
	
	

}
