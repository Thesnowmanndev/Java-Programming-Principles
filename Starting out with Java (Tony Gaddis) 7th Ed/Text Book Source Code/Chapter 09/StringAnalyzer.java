import java.util.Scanner;

/**
   This program displays the number of letters,
   digits, and whitespace characters in a string.
*/

public class StringAnalyzer
{
   public static void main(String [] args)
   {
      String input;        // To hold input
      char[] array;        // Array for input
      int letters = 0;     // Number of letters
      int digits = 0;      // Number of digits
      int whitespaces = 0; // Number of whitespaces
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      // Prompt the user to enter a line of input.
      System.out.print("Enter a string: ");
      input = keyboard.nextLine();

      // Convert the string to a char array.
      array = input.toCharArray();

      // Analyze the characters.
      for (int i = 0; i < array.length; i++)
      {
         if (Character.isLetter(array[i]))
            letters++;
         else if (Character.isDigit(array[i]))
            digits++;
         else if (Character.isWhitespace(array[i]))
            whitespaces++;
      }

      // Display the results.
      System.out.println("That string contains " +
                         letters + " letters, " +
                         digits + " digits, and " +
                         whitespaces + 
                         " whitespace characters.");
   }
}
