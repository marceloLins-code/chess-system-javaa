package chess;
import boardgame.BoardException;
import boardgame.Board;

public class ChassException extends BoardException{
	private static final long serialVersionUID = 1L;
	
	
	public ChassException(String msg){
	super(msg);
	}
}
