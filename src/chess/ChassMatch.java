package chess;

import boardgame.Board;

public class ChassMatch {
	
	private Board board;
	
	public ChassMatch(){
		board = new Board(8, 8);
				
	}
	
	public ChessPiace[][] getPiaces(){
		ChessPiace[][] mat = new ChessPiace[board.getRows()][board.getColumns()];
		for (int i = 0; i <board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				mat [i][j] = (ChessPiace) board.piace(i,j);
			}
			
		}
		return mat;
	} 
	

}
