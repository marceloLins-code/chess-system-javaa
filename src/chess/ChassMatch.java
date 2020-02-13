package chess;

import boardgame.Board;
import boardgame.Position;
import boardgame.Piace;
import chess.Piaces.King;
import chess.Piaces.Rook;


public class ChassMatch {	
	private Board board;
	
	public ChassMatch(){
		board = new Board(8, 8); // SETA O METODO A BAIXO PELO CONSTRUTOR EM BOARD								   
		initialSetup();		
	}
	
	//RETORNA O STATUS DA MATRIZ DE PEÇAS CORREPONDENTE A PARTIDA. ALOCA
	public ChessPiace[][] getPiaces(){
		ChessPiace[][] mat = new ChessPiace[board.getRows()][board.getColumns()];
		for (int i = 0; i <board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				mat [i][j] = (ChessPiace) board.piace(i,j);// ALOCA PEÇAS
															//NA POSIÇÃO I,J														   
			}
			
		}
		return mat;
	} 

	//executar movimento de xadrez
	public ChessPiace performChassMove(ChessPosition sourceposition, ChessPosition targetPosition){
		Position source = sourceposition.toPosition();
		Position target = targetPosition.toPosition();
		validateSourcePosition(source);
		//realiza o movimento da peça
		Piace capturedPiace = makeMove(source, target);
		return (ChessPiace)capturedPiace;
				
	}
	// retira e coloca na posiçãp
	private Piace makeMove(Position source, Position target){
		Piace p = board.removePiace(source);
		Piace capturedPiace = board.removePiace(target);
		board.placePiace(p, target);
		return capturedPiace;
		
	}
	// valida 
	private void validateSourcePosition(Position position){
		if (!board.thereIsApiace(position)) {
			throw new ChassException("Error creating Board: min 1 row end 1 column");			
		}		
	}
	
// 	recebe as cordenadas do chadrez
	private void placeNewPlace(char column, int row, ChessPiace piace ){
		board.placePiace(piace, new ChessPosition(column, row).toPosition());
	}
	
	
	private void initialSetup(){ // ALOCA A PEÇA NO TABULEIRO

		placeNewPlace('c', 2, new Rook(board, Color.WHITE));
		placeNewPlace('d', 2, new Rook(board, Color.WHITE));
		placeNewPlace('e', 2, new Rook(board, Color.WHITE));
		placeNewPlace('e', 1, new Rook(board, Color.WHITE));
		placeNewPlace('d', 1, new King(board, Color.WHITE));
		placeNewPlace('c', 1, new Rook(board, Color.WHITE));
		
		placeNewPlace('c', 7, new Rook(board, Color.BLACK));
		placeNewPlace('c', 8, new Rook(board, Color.BLACK));
        placeNewPlace('d', 7, new Rook(board, Color.BLACK));
        placeNewPlace('e', 7, new Rook(board, Color.BLACK));
        placeNewPlace('e', 8, new Rook(board, Color.BLACK));
        placeNewPlace('d', 8, new King(board, Color.BLACK));
        

	}
	
	
	

}
