import java.util.*;
import java.io.*;



public class Battleship {

  static Scanner scanner = new Scanner (System.in);

	public static void main(String[] args) {

    // Initializing boards using constructor.
    BattleshipBoard playerBoardOne = new BattleshipBoard();
    BattleshipBoard playerBoardTwo = new BattleshipBoard();

    // Print out text directions, 100 blank lines to seperate boards (No Peeking)
    System.out.println("Welcome to Battleship!\n");

    System.out.println("PLAYER 1, ENTER YOUR SHIPS\' COORDINATES.\n");

    // Assigning player ones ship locations using seperate class/method w\ params.
    AssignShips.assignBattleShip(playerBoardOne.getBoard(), scanner);

    // Print 100 new lines to prevent other player seeing ship locations.
    for(int i = 0; i < 1; i++){
      System.out.println("\n");
    }

    System.out.println("PLAYER 2, ENTER YOUR SHIPS\' COORDINATES.");

    // Assigning player twos ship locations using seperate class/method.
    AssignShips.assignBattleShip(playerBoardTwo.getBoard(), scanner);

    for(int i = 0; i < 1; i++){
      System.out.println("\n");
    }

    // Class/method w\params for taking turn to shoot other players ships.
    TargetBoard.targetShot(playerBoardOne.getBoard(), playerBoardTwo.getBoard(), scanner);

  }
}
