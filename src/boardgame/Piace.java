package boardgame;
	
public class Piace {// "PIACE" SUPER CLASSE
	
	protected Position position; //sing
	private Board board; //plu
	
	public Piace(Board board) {	
		this.board = board; 
		position = null;
	}
	// "protected" somente sub classes de pe�as podem acessar o tabuleiro,
	//pe�as de xadres e as respectivas
	protected Board getBoard() {
		return board;
	}

	
	
	

}
