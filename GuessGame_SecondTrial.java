import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessGame_SecondTrial {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("YOU ARE WELCOME TO GUESS NUMBER GAME");

        System.out.print("Enter Your Username Here:");
        String username = scanner.next();
        System.out.println("Hello " + username);

        System.out.println("Do you want to begin the game now?");
        System.out.println("\t1. Yes");
        System.out.println("\t2. No");
       System.out.println("HINT: Use 1 for YES and 2 for NO" );

        try {
            while (scanner.nextInt()!=1){
                System.out.println("Do YOu Want to Begin the Game Now?");
                System.out.println("\t1. Yes");
                System.out.println("\t2. No");
                System.out.println("HINT: Use 1 for YES and 2 for NO" );

            }
        }
                catch (InputMismatchException valid){
            System.out.println(username+ ", " + "Please enter a valid input of 1 or 2 ");

                  }
        //System.out.println("You've got less than 8 attempts for the game");
        Random random = new Random();
        int numberRoll = random.nextInt(20)+1;
        System.out.println("Enter the number am guessing here: ");
        int userinput = scanner.nextInt();

        userinput = 0;
        boolean gameWon = false;
        boolean gameOver = false;

      while (!gameOver){
          userinput++;

          if (userinput<8) {
              if (userinput == numberRoll) {
                 // System.out.println("Congratulations " + username + ", you have won the game");
                  gameWon = true;
                  gameOver = true;
              } else if (userinput<numberRoll){
                  System.out.println("Guess Higher");
                  userinput=scanner.nextInt();
              }else if (userinput>numberRoll){
                  System.out.println("Guess Lower");
                  userinput=scanner.nextInt();
              }
          }else {
             gameOver=true;
          }
      }

      if (gameWon){
          System.out.println("Congratulations " + username + ", you have won the game in the "+ userinput+ "attempt(s)");
      }else{
          System.out.println("Game Over");
          System.out.println("The guessed number was "+ numberRoll);
      }





    }
}
