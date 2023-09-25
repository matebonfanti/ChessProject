package boardgame;

public class Board {
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int rows, int columns) {
		
		this.rows = row;
		this.columns = columns;
		pieces = new Piece[rows][columns];
		
	}

	public int getRow() {
		return rows;
	}

	public void setRow(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	
}
