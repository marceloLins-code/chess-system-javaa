package boardgame;

public class Board {
	
		private int rows;
		private int columns;
		private Piace[][] piaces;
		
		
		public Board(int rows, int columns) {
			if (rows < 1 ||columns<1) {
				throw new BoardException(" const: Error creating Board: min 1 row end 1 column");
			}
			this.rows = rows;
			this.columns = columns;
			piaces = new Piace [rows][columns];			
			
		}

		public int getRows() {
			return rows;
		}

		public int getColumns() {
			return columns;
		}

		
		// RETORNA A MATRIZ PE�A DADA POR LINHA  E COLUNA
		public Piace piace(int row, int colum){
			if (!positionExists(row, colum)) {				
				// SE int row, int colum ESTIVER FORA DO TABULEIRO
				throw new BoardException("Piaace p w c: Position not on the board");				
			}
			return piaces [row][colum];
		}
		
		// RETORNA A PE�A QUE ESTA NA MATRIZ PELA POSI��O
		public Piace piace(Position position){ // INFORMA AO METODO A BAIXO A POSI��O DA PE�A
			if (!positionExists(position)) {
				throw new BoardException("Piece p pos: Position not on the board");
			}
			return piaces [position.getRow()][position.getColumn()];
		}
		
		// colocar pe�a na posi��o do tabuleiro
		public void placePiace(Piace piece, Position position){
			if (thereIsApiace(position)) {
				throw new BoardException("Placepiace: there is already a piace on position"+ position);
			}
		 // piaces -> MATRIZ DE PE�A DO TABULEIRO
			piaces[position.getRow()][position.getColumn()]  = piece; //MATRIZ piaces, NA POSI���O DADA																		recebe pe�a
			piece.position   = position; // !null					  // RECEBE PE�A
		}
		
		// Quando uma posi��o numa dada linha e coluna existe?
	      // qunado esta posi��o existe no tabuleiro
		public boolean positionExists(int row, int column){
			return row >= 0 && row <= rows && column >=0 && column <= columns;
		}
		// verifica se uma posi��o existe, conforme condi��o do metodo acima
		public boolean positionExists(Position position){
			return positionExists(position.getRow(),position.getColumn());			
			
		}
		//verifica se ha uma pe�a nesta posi��o
		public boolean thereIsApiace(Position position){
			if (!positionExists(position)) {
				throw new BoardException("there is: position not on the board");
			}
			return piace(position) !=null;
			
		}

}
