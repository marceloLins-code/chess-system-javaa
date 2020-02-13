package application;
import chess.Color;
import chess.ChessPiace;

public class UI { // imprime as tabuleiro c peças da partida, imagem atual da partida
	
	// https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println

          
		public static final String ANSI_RESET = "\u001B[0m";
		public static final String ANSI_BLACK = "\u001B[30m";
		public static final String ANSI_RED = "\u001B[31m";
		public static final String ANSI_GREEN = "\u001B[32m";
		public static final String ANSI_YELLOW = "\u001B[33m";
		public static final String ANSI_BLUE = "\u001B[34m";
		public static final String ANSI_PURPLE = "\u001B[35m";
		public static final String ANSI_CYAN = "\u001B[36m";
		public static final String ANSI_WHITE = "\u001B[37m";

		public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
		public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
		public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
		public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
		public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
		public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
		public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
		public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
	
		
	
	// pega a linha e coluna do contrutor da ChessPiace e incrementa o tamanho do tabuleiro
	public static void printBoard(ChessPiace[][] piaces){
		for (int i = 0; i < piaces.length; i++) {
			System.out.print((8-i)+" ");
			for (int j = 0; j < piaces.length; j++) {
				printPiece(piaces[i][j]); //chamou a matriz de peças, qauis sejam
			}							  //
			System.out.println();		
		}
		System.out.println("  a b c d e f g h");	
	}

	private static void printPiece(ChessPiace piace) {
		if (piace == null) {
			System.out.print("-");
		}
        else {
            if (piace.getColor() == Color.WHITE) {
                System.out.print(ANSI_WHITE + piace + ANSI_RESET);
            }
            else {
                System.out.print(ANSI_YELLOW + piace + ANSI_RESET);
            }
        }
        System.out.print(" ");
	}
}
