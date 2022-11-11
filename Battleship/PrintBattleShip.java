public class PrintBattleShip {

public static void printBattleShip(char[][] player) {
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
