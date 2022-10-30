import java.util.*;
import java.io.*;


public class Battleship {

  private static Scanner scanner;

	public static void main(String[] args) {

    scanner = new Scanner(System.in);

    // Declare and initialize 2D arrays.
    char[][] player1 = {{'-', '-', '-', '-', '-'},
                        {'-', '-', '-', '-', '-'},
                        {'-', '-', '-', '-', '-'},
                        {'-', '-', '-', '-', '-'},
                        {'-', '-', '-', '-', '-'}};

    char[][] player2 = {{'-', '-', '-', '-', '-'},
                        {'-', '-', '-', '-', '-'},
                        {'-', '-', '-', '-', '-'},
                        {'-', '-', '-', '-', '-'},
                        {'-', '-', '-', '-', '-'}};

    System.out.println("Welcome to Battleship!\n");

    System.out.println("PLAYER 1, ENTER YOUR SHIPS\' COORDINATES.");

    assignBattleShip(player1);

    printBattleShip(player1);
    }

  // Method to assign ship locations to game board.
  private static void assignBattleShip(char[][] player) {

    int count = 1;

    String a;
    String b;

    do {
      System.out.println("Enter ship " + count + " location:");

      a = scanner.next();
      b = scanner.next();

      // converting value to integer
      int row = Integer.parseInt(a);
      int col = Integer.parseInt(b);


      if (row > 4 || col > 4) {
        System.out.println("Invalid coordinates. Choose different coordinates.");
      } else  if (player[row][col] == '@') {
        System.out.println("You already have a ship there. Choose different coordinates.");
      } else if ((row >= 0 && row <= 4) && (col >= 0 && col <= 5)) {
        // Assigning new element to 2D array
        player[row][col] = '@';
        // Only count++ when userInput is valid
        count++;
      }
    } while(count < 6);

  }

  // Use this method to print game boards to the console.
	private static void printBattleShip(char[][] player) {
		System.out.print("  ");
		for (int row = -1; row < 5; row++) {
			if (row > -1) {
				System.out.print(row + " ");
			}
			for (int column = 0; column < 5; column++) {
				if (row == -1) {
					System.out.print(column + " ");
				} else {
					System.out.print(player[row][column] + " ");
				}
			}
			System.out.println("");
		}
	}

}
