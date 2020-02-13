
package application;

import chess.ChassMatch;
 	



public class Program {
	
	public static void main(String[] args){
		
		ChassMatch chassMatch = new ChassMatch();
		UI.printBoard(chassMatch.getPiaces()); //O METODO printBoard USA SUA ESTRUTURA PARA DESENHAR
												// JUNTO AO METODO getPiaces(), ESTA 
												//  SETA AS PECAS
		
		
		
	}

}
