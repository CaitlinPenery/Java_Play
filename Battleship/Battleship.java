import java.util.*;
import java.io.*;

<<<<<<< HEAD


public class Battleship {

  static Scanner scanner = new Scanner (System.in);
=======

public class Battleship {

  private static Scanner scanner;
>>>>>>> 37c827767d7f7425c27adcf96b8892c034830bb1

	public static void main(String[] args) {

    scanner = new Scanner(System.in);

    // Declare and initialize 2D arrays.



    char startingBoard[][] = {{'-', '-', '-', '-', '-'},
                              {'-', '-', '-', '-', '-'},
                              {'-', '-', '-', '-', '-'},
                              {'-', '-', '-', '-', '-'},
                              {'-', '-', '-', '-', '-'}};

    BattleshipBoard playerOne = new BattleshipBoard(startingBoard);
    BattleshipBoard playerTwo = new BattleshipBoard(startingBoard);

    System.out.println("Welcome to Battleship!\n");

    System.out.println("PLAYER 1, ENTER YOUR SHIPS\' COORDINATES.");
<<<<<<< HEAD
=======

    assignBattleShip(player1);
>>>>>>> 37c827767d7f7425c27adcf96b8892c034830bb1

    // AssignShips.assignBattleShip(scanner);

    // playerOne.toChar();

    PrintBattleShip.printBattleShip(playerOne.toChar());

    // Print 100 new lines to prevent other player seeing ship locations.
    for(int i = 0; i < 100; i++){
      System.out.println("\n");
    }

<<<<<<< HEAD
    System.out.println("PLAYER 2, ENTER YOUR SHIPS\' COORDINATES.");

    // AssignShips.assignBattleShip(scanner);

    // PrintBattleShip.printBattleShip(player2);

    for(int i = 0; i < 100; i++){
      System.out.println("\n");
    }
=======
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
>>>>>>> 37c827767d7f7425c27adcf96b8892c034830bb1

    // targetShot(player1, player2, targetBoard1, targetBoard2);
    // }



//   private static void targetShot(char[][] playerOne, char[][] playerTwo, char[][] targetBoardOne, char[][] targetBoardTwo) {
//
//     boolean validOne = false;
//     boolean validTwo = false;
//     boolean win = false;
//
//     int row;
//     int col;
//     int count = 0;
//
//     while(win == false){
//
//
//       while (validOne == false && win == false){
//
//         System.out.println("\nPlayer 1, enter hit row/column:");
//
//         row = scanner.nextInt();
//         col = scanner.nextInt();
//
//         if (row > 4 || row < 0 || col > 4 || col < 0) {
//           System.out.println("Invalid coordinates. Choose different coordinates.");
//           validOne = false;
//         } else if ((row >= 0 && row <= 4) && (col >= 0 && col <= 5)) {
//           if (targetBoardOne[row][col] == 'X' || targetBoardOne[row][col] == 'O') {
//             System.out.println("You already fired on this spot. Choose different coordinates.");
//             validOne = false;
//           } else if(playerTwo[row][col] == '@'){
//             targetBoardOne[row][col] = 'X';
//             System.out.println("PLAYER 1 HIT PLAYER 2\'s SHIP!");
//             validOne = true;
//           } else if(playerTwo[row][col] == '-'){
//             targetBoardOne[row][col] = 'O';
//             System.out.println("PLAYER 1 MISSED!");
//             validOne = true;
//           }
//         }
//             PrintBattleShip.printBattleShip(targetBoardOne);
//       }
//
//             validOne = false;
//
//       for (int tarCol = 0; tarCol < targetBoardOne[0].length; tarCol++) {
//         for (int tarRow = 0; tarRow < targetBoardOne.length; tarRow++) {
//         if (targetBoardOne[tarRow][tarCol] == 'X') {
//             count++;
//             if (count > 4) {
//               System.out.println("PLAYER 1 WINS! YOU SUNK ALL OF YOUR OPPONENT\'S SHIPS!\n");
//
//               System.out.println("Final Boards:\n");
//
//               PrintBattleShip.printBattleShip(targetBoardOne);
//
//               System.out.println("\n");
//
//               PrintBattleShip.printBattleShip(targetBoardTwo);
//
//               win = true;
//               // System.exit(0);
//             }
//         }
//     }
// }
//
// count = 0;
//
//       while (validTwo == false && win == false){
//
//         System.out.println("\nPlayer 2, enter hit row/column:");
//
//         row = scanner.nextInt();
//         col = scanner.nextInt();
//
//         if (row > 4 || row < 0 || col > 4 || col < 0) {
//           System.out.println("Invalid coordinates. Choose different coordinates.");
//           validTwo = false;
//         } else if ((row >= 0 && row <= 4) && (col >= 0 && col <= 5)) {
//           if (targetBoardTwo[row][col] == 'X' || targetBoardTwo[row][col] == 'O') {
//             System.out.println("You already fired on this spot. Choose different coordinates.");
//             validTwo = false;
//           } else if(playerOne[row][col] == '@'){
//             targetBoardTwo[row][col] = 'X';
//             System.out.println("PLAYER 2 HIT PLAYER 1\'s SHIP!");
//             validTwo = true;
//           } else if(playerOne[row][col] == '-'){
//             targetBoardTwo[row][col] = 'O';
//             System.out.println("PLAYER 2 MISSED!");
//             validTwo = true;
//           }
//         }
//             PrintBattleShip.printBattleShip(targetBoardTwo);
//       }
//
//
//
//       validTwo = false;
//
//
//
// for (int tarCol = 0; tarCol < targetBoardTwo[0].length; tarCol++) {
//   for (int tarRow = 0; tarRow < targetBoardTwo.length; tarRow++) {
//   if (targetBoardTwo[tarRow][tarCol] == 'X') {
//       count++;
//       if (count > 4) {
//         System.out.println("PLAYER 2 WINS! YOU SUNK ALL OF YOUR OPPONENT\'S SHIPS!\n");
//
//         System.out.println("Final Boards:\n");
//
//         PrintBattleShip.printBattleShip(targetBoardOne);
//
//         System.out.println("\n");
//
//         PrintBattleShip.printBattleShip(targetBoardTwo);
//
//         win = true;
//         // System.exit(0);
//       }
//     }
//   }
// }
// count = 0;
//     }
  }

}
