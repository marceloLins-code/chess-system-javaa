package boardgame;
	
public class Piace {//"PIACE"SUPER CLASSE
	
	protected Position position;
	private Board board;
	
	public Piace(Board board) {	
		this.board = board;
		position = null;
	}
	// "protected" somente sub classes de peças podem acessar o tabuleiro,
	//peças de xadres e as respectivas
	protected Board getBoard() {
		return board;
	}

	
	
	

}
