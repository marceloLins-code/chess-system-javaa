package chess;



import chess.Piaces.King;
import chess.Piaces.Rook;
import boardgame.Board;
import boardgame.Piace;
import boardgame.Position;

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
	
// 	recebe as cordenadas do chadrez
	private void placeNewPlace(char column, int row, ChessPiace piace ){
		board.placePiace(piace, new ChessPosition(column, row).toPosition());
	}
	
	
	private void initialSetup(){ // ALOCA A PEÇA NO TABULEIRO
		placeNewPlace('b',6,new Rook(board, Color.WHITE));
		placeNewPlace('e',8,new King(board, Color.BLACK));
		placeNewPlace('e',1,new King(board, Color.WHITE));
		
		
	}
	

}
