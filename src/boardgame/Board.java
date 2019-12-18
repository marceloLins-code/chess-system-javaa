package boardgame;

public class Board {
	
		private int rows;
		private int columns;
		private Piace[][] piaces;
		
		
		public Board(int rows, int columns) {
			this.rows = rows;
			this.columns = columns;
			piaces = new Piace [rows][columns];
			
			
			
		}


		public int getRows() {
			return rows;
		}


		public void setRows(int rows) {
			this.rows = rows;
		}


		public int getColumns() {
			return columns;
		}


		public void setColumns(int columns) {
			this.columns = columns;
		}
		
		
		public Piace piace(int row, int colum){
			return piaces [row][colum];
		}
		
		public Piace piace(Position position){
			return piaces [position.getRow()][position.getColumn()];
		}

}
