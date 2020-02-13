package chess;

import boardgame.Position;

public class ChessPosition {
	private char column;
	private int row;
	
	public ChessPosition(char column, int row) {
		if (column < 'a'||column >'h'||row<1||row>8) {
			throw new ChassException("Error instatiating ChassPosition, valid values are from a1 to h8");
		}
		this.column = column;
		this.row = row;
	}

	public char getColumn() {
		return column;
	}

	

	public int getRow() {
		return row;
	}
	// RETORNA MATRIX XADREZ (N,N)
	protected Position toPosition(){
		return new Position (8 - row, column-'a' );
	}
	// para retornar uma posi��o chess ( a,1) DA POSI��O FORNECIDA NO PARAMETRO
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow());
	}
	
	@Override
	public String toString(){
		return "" + row + column;
	}
	

}
