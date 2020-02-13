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

		
		// RETORNA A MATRIZ PEÇA DADA POR LINHA  E COLUNA
		public Piace piace(int row, int colum){
			if (!positionExists(row, colum)) {				
				// SE int row, int colum ESTIVER FORA DO TABULEIRO
				throw new BoardException("Piaace p w c: Position not on the board");				
			}
			return piaces [row][colum];
		}
		
		// RETORNA A PEÇA QUE ESTA NA MATRIZ PELA POSIÇÃO
		public Piace piace(Position position){ // INFORMA AO METODO A BAIXO A POSIÇÃO DA PEÇA
			if (!positionExists(position)) {
				throw new BoardException("Piece p pos: Position not on the board");
			}
			return piaces [position.getRow()][position.getColumn()];
		}
		
		// colocar peça na posição do tabuleiro
		public void placePiace(Piace piece, Position position){
			if (thereIsApiace(position)) {
				throw new BoardException("Placepiace: there is already a piace on position"+ position);
			}
		 // piaces -> MATRIZ DE PEÇA DO TABULEIRO
			piaces[position.getRow()][position.getColumn()]  = piece; //MATRIZ piaces, NA POSIÇÇÃO DADA																		recebe peça
			piece.position   = position; // !null					  // RECEBE PEÇA
		}
		
		// Quando uma posição numa dada linha e coluna existe?
	      // qunado esta posição existe no tabuleiro
		public boolean positionExists(int row, int column){
			return row >= 0 && row <= rows && column >=0 && column <= columns;
		}
		// verifica se uma posição existe, conforme condição do metodo acima
		public boolean positionExists(Position position){
			return positionExists(position.getRow(),position.getColumn());			
			
		}
		//verifica se ha uma peça nesta posição
		public boolean thereIsApiace(Position position){
			if (!positionExists(position)) {
				throw new BoardException("there is: position not on the board");
			}
			return piace(position) !=null;
			
		}

}
