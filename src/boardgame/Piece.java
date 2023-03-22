package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece() {
		
	}

	public Piece(Board board) {
		this.board = board;
		position = null; //se não for atribuido o valor já vem null por padrão
	}

	protected Board getBoard() {
		return board;
	}

	//apenas o getBoard porque não queremos que nosso tabuleiro seja alterado
	
}
