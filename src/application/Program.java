
package application;

import java.util.Scanner;

import chess.ChassMatch;
import chess.ChessPosition;
import chess.ChessPiace;
 	



public class Program {
	
	
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		ChassMatch chassMatch = new ChassMatch();
		
		while(true){
			UI.printBoard(chassMatch.getPiaces()); //O METODO printBoard USA SUA ESTRUTURA PARA DESENHAR
			// JUNTO AO METODO getPiaces(), ESTA 
			//  SETA AS PECAS
			System.out.println();
			System.out.print("source: ");
			ChessPosition source = UI.readChessPosition(sc);
			
			System.out.println();
			System.out.print("target: ");
			ChessPosition target = UI.readChessPosition(sc);
		
			ChessPiace capturChessPiace = chassMatch.performChassMove(source, target);
					
			
		}
		
				
	}

}
