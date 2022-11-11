import java.util.*;

public class OneShot {

  public static void fire(char[][] playerBoard, char[][] targetBoard, Scanner scanner) {

    boolean valid = false;
    boolean win = false;

    int row;
    int col;
    int count = 0;

      while (valid == false && win == false){

        row = scanner.nextInt();
        col = scanner.nextInt();

        if (row > 4 || row < 0 || col > 4 || col < 0) {
          System.out.println("Invalid coordinates. Choose different coordinates.");
          valid = false;
        } else if ((row >= 0 && row <= 4) && (col >= 0 && col <= 5)) {
          if (targetBoard[row][col] == 'X' || targetBoard[row][col] == 'O') {
            System.out.println("You already fired on this spot. Choose different coordinates.");
            valid = false;
          } else if(playerBoard[row][col] == '@'){
            targetBoard[row][col] = 'X';
            System.out.println("\n******HIT!******\n");
            valid = true;
          } else if(playerBoard[row][col] == '-'){
            targetBoard[row][col] = 'O';
            System.out.println("\n******MISS!******\n");
            valid = true;
          }
        }
            PrintBattleShip.printBattleShip(targetBoard);
      }

            valid = false;

      for (int tarRow = 0; tarRow < targetBoard[0].length; tarRow++) {
        for (int tarCol = 0; tarCol < targetBoard.length; tarCol++) {
        if (targetBoard[tarRow][tarCol] == 'X') {
            count++;}
            if (count > 4) {
              System.out.println("PLAYER 1 WINS! YOU SUNK ALL OF YOUR OPPONENT\'S SHIPS!\n");

              System.out.println("Final Boards:\n");

              PrintBattleShip.printBattleShip(targetBoard);

              System.out.println("\n");

              PrintBattleShip.printBattleShip(targetBoard);

              win = true;
            } else count = 0;
        }

  }

    }
  }
