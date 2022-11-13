import java.util.*;

public class OneShot {

  public static void fire(char[][] playerBoard, char[][] targetBoard, Scanner scanner) {

    boolean valid = false;

    int row;
    int col;

      // While loop that will get input if variable is not valid.
      while (valid == false){
        // User input from scanner.
        row = scanner.nextInt();
        col = scanner.nextInt();
        // Ensures conditions are within the 2D array.
        if (row > 4 || row < 0 || col > 4 || col < 0) {
          System.out.println("Invalid coordinates. Choose different coordinates.");
        } else if ((row >= 0 && row <= 4) && (col >= 0 && col <= 5)) {
          if (targetBoard[row][col] == 'X' || targetBoard[row][col] == 'O') {
            System.out.println("You already fired on this spot. Choose different coordinates.");
            // Reasigns variable in 2D array.
          } else if(playerBoard[row][col] == '@'){
            targetBoard[row][col] = 'X';
            System.out.println("\n******HIT!******\n");
            // Changes valid to true to stop while loop.
            valid = true;
          } else if(playerBoard[row][col] == '-'){
            targetBoard[row][col] = 'O';
            System.out.println("\n******MISS!******\n");
            valid = true;
          }
      }
        PrintBattleShip.printBattleShip(targetBoard);
    }
  }
}
