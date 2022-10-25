import java.util.Scanner;

public class Calculator {
  public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);

    System.out.println("List of operations: add subtract multiply divide alphabetize");

    System.out.println("Enter an operation: ");
    String operation = userInput.next();

    String a;
    String b;

    switch (operation.toLowerCase()){
      case "add":
      System.out.println("Enter two intergers: ");
      a = userInput.next();
      b = userInput.next();
      try{
        int totalInt = Integer.parseInt(a) + Integer.parseInt(b);
        System.out.println("Answer " + totalInt);
        break;
      } catch(Exception e){
        System.out.println("Invalid input entered. Terminating...");
      }
      break;

      case "subtract":
      System.out.println("Enter two intergers: ");
      a = userInput.next();
      b = userInput.next();
      try{
        int totalInt = Integer.parseInt(a) - Integer.parseInt(b);
        System.out.println("Answer " + totalInt);
        break;
      } catch(Exception e){
        System.out.println("Invalid input entered. Terminating...");
      }
      break;

      case "multiply":
      System.out.println("Enter two doubles: ");
      a = userInput.next();
      b = userInput.next();
      try{
        double total = Double.parseDouble(a) * Double.parseDouble(b);
        System.out.printf("Answer %.2f", total);
        break;
      } catch(Exception e){
        System.out.println("Invalid input entered. Terminating...");
      }
      break;

      case "divide":
      System.out.println("Enter two doubles: ");
      a = userInput.next();
      b = userInput.next();

      if(Double.parseDouble(b) == 0){
        System.out.println("Invalid input entered. Terminating...");
        break;
      }
      else {
        try{
          double total = Double.parseDouble(a) / Double.parseDouble(b);
          System.out.printf("Answer: %.2f", total);
          break;
        } catch(Exception e){
          System.out.println("Invalid input entered. Terminating...");
        }
      }
      break;

      case "alphabetize":
      System.out.println("Enter two words: ");
      String stringOne = userInput.next();
      String stringTwo = userInput.next();
      int totalString = stringOne.compareToIgnoreCase(stringTwo);
      if (totalString == 0){
        System.out.println("Answer: Chicken or Egg");
      } else if (totalString < 0){
        System.out.println("Answer: " + stringOne + " comes before " + stringTwo + " alphabetically");
      } else {
        System.out.println("Answer: " + stringTwo + " comes before " + stringOne + " alphabetically");
      }
      break;

      default:
      System.out.println("Invalid input entered. Terminating...");
      break;
    }

    }
}
