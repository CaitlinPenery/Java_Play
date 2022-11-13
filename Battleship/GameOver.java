// For loop to count the number of hits and set HasWon to true when ships hit equals ships on the board.

public class GameOver{

  public static void endGame(char[][] playerBoard, char[][] targetBoard,  HasWon won){

    // Initializing and assigning value to count.
    int count = 0;

    // For loop to run through 2D array.
    for (int row = 0; row < targetBoard[0].length; row++) {
      for (int col = 0; col < targetBoard.length; col++) {
      // Add 1 to count for every ship hit.
      if (targetBoard[row][col] == 'X') {
          count++;
        }
      // Set variable to true when count value equals 5(the ammount of ships on the board).
      if (count == 5) {
        won.setWin(true);
        }
      }
    }
  }
}
