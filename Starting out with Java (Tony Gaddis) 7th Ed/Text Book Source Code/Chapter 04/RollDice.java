import java.util.Scanner;
import java.util.Random;

/**
   This program simulates the rolling of dice.
*/

public class RollDice
{
   public static void main(String[] args)
   {
      String again = "y";  // To control the loop
      int die1;            // To hold the value of die #1
      int die2;            // to hold the value of die #2
      
      // Create a Scanner object to read keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Create a Random object to generate random numbers.
      Random rand = new Random();
      
      // Simulate rolling the dice.
      while (again.equalsIgnoreCase("y"))
      {
         System.out.println("Rolling the dice...");
         die1 = rand.nextInt(6) + 1;
         die2 = rand.nextInt(6) + 1;
         System.out.println("Their values are:");
         System.out.println(die1 + " " + die2);
         
         System.out.print("Roll them again (y = yes)? ");
         again = keyboard.nextLine();
      }
   }
}