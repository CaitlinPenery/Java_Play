import java.util.*;

public class TargetBoard {

public static void targetShot(char[][] playerTwo, char[][] playerOne, Scanner scanner) {

  BattleshipBoard targetBoardOne = new BattleshipBoard();
  BattleshipBoard targetBoardTwo = new BattleshipBoard();

// Loop to continue until one player wins.
  System.out.print("\n Player 1, enter hit row/column: ");

  OneShot.fire(playerOne, targetBoardOne.getBoard(), scanner);

  System.out.print("\n Player 2, enter hit row/column: ");

  OneShot.fire(playerTwo, targetBoardTwo.getBoard(), scanner);

  }
}
