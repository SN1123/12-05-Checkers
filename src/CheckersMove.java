import java.lang.Math;

class CheckersMove {
// A CheckersMove object represents a move in the game of Checkers.
// It holds the row and column of the piece that is to be moved
// and the row and column of the square to which it is to be moved.
// (This class makes no guarantee that the move is legal.)
// Position of piece to be moved.
// Square it is to move to.
// Constructor. Just set the values of the instance variables.
// Accessors
  private int columnFrom;
  private int rowFrom;
  private int columnTo;
  private int rowTo;
  public CheckersMove (int roFrom, int colFrom, int roTo, int colTo)
  {
    columnFrom = colFrom;
    rowFrom = roFrom;
    columnTo = colTo;
    rowTo = roTo;
  }
  public int getFromCol ()
  {
    return columnFrom;
  }
  public int getFromRow ()
  {
    return rowFrom;
  }
  public int getToCol ()
  {
    return columnTo;
  }
  public int getToRow ()
  {
    return rowTo;
  }
  public boolean isJump ()
  {
    return Math.abs(rowFrom-rowFrom) == 2;
  }
  
} // end class CheckersMove.
