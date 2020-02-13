package application;

import chess.ChessPiace;

public class UI { // imprime as tabuleir c peças da partida, imagem atual da partida
	
	// pega a linha e coluna do contrutor da ChessPiace e incrementa o tamanho do tabuleiro
	public static void printBoard(ChessPiace[][] piaces){
		for (int i = 0; i < piaces.length; i++) {
			System.out.print((8-i)+" ");
			for (int j = 0; j < piaces.length; j++) {
				printPiace(piaces[i][j]); //chamou a matriz de peças, qauis sejam
			}							  //
			System.out.println();		
		}
		System.out.println("  a b c d e f g h");	
	}

	public static void printPiace(ChessPiace piace){
		
		if (piace == null) {
			System.out.print("-");
			
		}else{
			System.out.print(piace);
		}
		
		System.out.print(" ");

	}
}
