import java.util.*;
import java.io.*;
import java.util.Scanner;

public class Battleship {
	public static void main(String[] args) {

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

    assignBattleShip(player1);

    printBattleShip(player1);
    }

  // Seperate method for user input?
  private static void assignBattleShip(char[][] player) {

    // Declare and initialize scanner.
    Scanner userInput = new Scanner(System.in);

    int count = 1;

    String a;
    String b;

    System.out.println("PLAYER 1, ENTER YOUR SHIPS’ COORDINATES.");

    while (count < 6) {
      
      System.out.println("Enter ship" + count + " location:");

      a = userInput.next();
      b = userInput.next();

      // Only count++ when userInput is valid
      count++;
    }

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
