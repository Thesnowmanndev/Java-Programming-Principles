import java.io.*;

/**
   This program demonstrates reading a file using only
   a FileReader object.
*/

public class SimpleFileReader
{
   public static void main(String[] args)
   {
      int rawData;        // To hold a character code
      char ch;            // To hold a character

      try
      {
         // Open the file.
         FileReader freader =
                new FileReader("GoodFile.txt");

         // Read a character code from the file.
         rawData = freader.read();
         while (rawData != -1)
         {
            // Convert the code to a character.
            ch = (char) rawData;
            // Print the character.
            System.out.print(ch);
            // Get the next code from the stream.
            rawData = freader.read();
         }
      }
      catch (IOException e)
      {
         System.out.println("Error: " +
                            e.getMessage());
      }
   }
}