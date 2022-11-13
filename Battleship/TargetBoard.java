import java.util.*;

public class TargetBoard {

public static void targetShot(char[][] playerTwo, char[][] playerOne, Scanner scanner) {

  BattleshipBoard targetBoardOne = new BattleshipBoard();
  BattleshipBoard targetBoardTwo = new BattleshipBoard();
  HasWon win = new HasWon();

  boolean won = win.getWin();
  
  // Neverending while loop because won will always be one of the boolean values.
  while(won == false || won == true) {
    // Winners message when condition is met.
    if(won == true){
      System.out.println("PLAYER 2 WINS! YOU SUNK ALL OF YOUR OPPONENT\'S SHIPS!\n");
      System.out.println("Final Boards:\n");
      // Prints game boards.
      PrintBattleShip.printBattleShip(targetBoardOne.getBoard());
      System.out.println("\n");
      PrintBattleShip.printBattleShip(targetBoardTwo.getBoard());
      // Exits the neverending while loop.
      System.exit(0);
    }
    else {
      System.out.print("\nPlayer 1, enter hit row/column: ");
      /* Accessing class methods
        - fire takes user input, checks the players board then assigns values to target board
        - endGame checks to see if all targets have been hit and assigns value to HasWon */
      OneShot.fire(playerOne, targetBoardOne.getBoard(), scanner);
      GameOver.endGame(playerOne, targetBoardOne.getBoard(), win);
      // Reasigns value of won for condition check.
      won = win.getWin();
    }

    if(won == true){
      System.out.println("PLAYER 1 WINS! YOU SUNK ALL OF YOUR OPPONENT\'S SHIPS!\n");
      System.out.println("Final Boards:\n");
      PrintBattleShip.printBattleShip(targetBoardOne.getBoard());
      System.out.println("\n");
      PrintBattleShip.printBattleShip(targetBoardTwo.getBoard());
      System.exit(0);
    }
    else {
      System.out.print("\nPlayer 2, enter hit row/column: ");
      OneShot.fire(playerTwo, targetBoardTwo.getBoard(), scanner);
      GameOver.endGame(playerTwo, targetBoardTwo.getBoard(), win);
      won = win.getWin();
    }
    }
  }
}
