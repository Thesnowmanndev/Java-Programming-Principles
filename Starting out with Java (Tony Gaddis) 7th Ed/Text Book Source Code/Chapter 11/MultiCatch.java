import java.io.*;    // For File class and FileNotFoundException
import java.util.*;  // For Scanner and InputMismatchException

/**
   This program demonstrates how multiple exceptions can
   be caught with a single catch clause.
*/

public class MultiCatch
{
   public static void main(String[] args)
   {
      int number;    // To hold a number from the file
      
      try
      {
         // Open the file.
         File file = new File("Numbers.txt");
         Scanner inputFile = new Scanner(file);

         // Process the contents of the file.
         while (inputFile.hasNext())
         {
            // Get a number from the file.
            number = inputFile.nextInt();
            
            // Display the number.
            System.out.println(number);
         }

         // Close the file.
         inputFile.close();
      }
      catch(FileNotFoundException | InputMismatchException ex)
      {
         // Display an error message.
         System.out.println("Error processing the file.");
      }
   }
}