package boardgame;

public class Position {
	 private int row;
	    private int column;

	    //construct
	    public Position(int row, int column){
	        this.row = row;
	        this.column = column;
	    }

	    //getters e setters
	    public int getRow(){
	        return this.row;
	    }

	    public int getColumn(){
	        return this.column;
	    }

	    public void setRow(int row){
	        this.row = row;
	    }

	    public void setColumn(int column){
	        this.column = column;
	    }

	    @Override
	    public String toString(){
	        return row + ", "+ column;
	    }
}