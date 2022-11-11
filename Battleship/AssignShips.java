import java.util.*;


public class AssignShips {

  public static void assignBattleShip(char[][] player, Scanner scanner) {

    // Initializing variables
    int count = 1;

    int row;
    int col;

    // do/while loop so that method repeats until 5 ships assigned a row and column.
    do {
      // Print out intructions and error messages.
      System.out.print("Enter ship " + count + " location: ");

      // Recieving input from scanner and assigning the value to the variable.
      // Currently no error handling if input is not an int. Use try/catch?
      row = scanner.nextInt();
      col = scanner.nextInt();

      // Series of if/else statements to ensure row and col are within array size
      // and not already assigned a ship value.
      if (row > 4 || row < 0 || col > 4 || col < 0) {
        System.out.println("Invalid coordinates. Choose different coordinates.");
      } else if (player[row][col] == '@') {
        System.out.println("You already have a ship there. Choose different coordinates.");
      } else if ((row >= 0 && row <= 4) && (col >= 0 && col <= 5)) {
        // Assigning new value to 2D array
        player[row][col] = '@';
        // Only count++ when user input is valid
        count++;
      }
    } while(count < 6);
    System.out.println();
    PrintBattleShip.printBattleShip(player);
  }
}
