public class BattleshipBoard {

  public char[][] board;

  public BattleshipBoard(char[][] playerBoard){
    board = playerBoard;
  }

  public char[][] toChar(){
    return board;
  }

}
