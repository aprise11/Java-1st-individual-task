/*Easy: 
•Ask user for row and column and write in the two dimensional array a value "1" in the correct place.
•Check whether or not the row chosen by user contains all 1.
•If all elements in row contain 1, then let player know they won.

1. Initializing a game grid
2. Game while loop asking user for row and column plus print&check if all 1
3. Printing method
4. Method to check all elements in a row
*/
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    System.out.println("GAME RULES: \n \n 📍 Collect a row full of 1s to win! \n ");

    //1. Initializing a game grid
    int[][] gameGrid = {
      {0, 0, 0},
      {0, 0, 0},
      {0, 0, 0}
    };

    Scanner scanner = new Scanner(System.in);
    boolean userGameIsOver = false;

    //2. Game while loop asking user for row and column plus print&check if all 1
    while(!userGameIsOver){
      System.out.println("👉 Write row number (0-2) and press enter:");
      int row = scanner.nextInt();
      System.out.println("👇 Write column number (0-2) and press enter:");
      int column = scanner.nextInt();

      gameGrid[row][column] = 1;
      //3. Printing method
      printGameGrid(gameGrid);
      //4. Method to check all elements in a row are 1
      if (isRowAllOnes(gameGrid, row)){
        System.out.println("\n 🎉 Congrats, you won! 🎉");
        userGameIsOver = true;
      }       
    }
    scanner.close();
  } 
  public static void printGameGrid(int[][] gameGrid){
    System.out.println("Your game grid:");
    System.out.println("-------------");
    for(int i = 0; i < gameGrid.length; i++){
      System.out.print("| ");
      for(int j = 0; j < gameGrid[i].length; j++){
        System.out.print(gameGrid[i][j] + " | ");
      }
      System.out.println();
      System.out.println("-------------");
    }
  }
  public static boolean isRowAllOnes(int[][] gameGrid, int row){
    for(int i = 0; i < gameGrid[row].length; i++){
      if(gameGrid[row][i] !=1){
        return false;
      }
    }
    return true;
  }  
}
