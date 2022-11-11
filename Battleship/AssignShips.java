import java.util.*;


public class AssignShips {

  // Method to assign ship locations to game board.
  public static void assignBattleShip(Scanner scanner) {

    int count = 1;

    int row;
    int col;

    BattleshipBoard player = new BattleshipBoard();

    // do {
    //   System.out.println("Enter ship " + count + " location:");
    //
    //   row = scanner.nextInt();
    //   col = scanner.nextInt();

    //   if (row > 4 || row < 0 || col > 4 || col < 0) {
    //     System.out.println("Invalid coordinates. Choose different coordinates.");
    //   } else  if (player[row][col] == '@') {
    //     System.out.println("You already have a ship there. Choose different coordinates.");
    //   } else if ((row >= 0 && row <= 4) && (col >= 0 && col <= 5)) {
    //     // Assigning new element to 2D array
    //     player[row][col] = '@';
    //     // Only count++ when userInput is valid
    //     count++;
    //   }
    // } while(count < 6);
    System.out.println(player);
  }
}
