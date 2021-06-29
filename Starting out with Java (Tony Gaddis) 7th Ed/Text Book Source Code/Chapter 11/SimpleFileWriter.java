import java.io.*;

/**
   This program demonstrates writing to a file using
   only a FileWriter object.
*/

public class SimpleFileWriter
{
   public static void main(String[] args)
   {
      // A string to write to the file.
      String output = "To thine own self be true.";
      int rawData;        // To hold a character code

      try
      {
         // Open the file.
         FileWriter fwriter =
                new FileWriter("NewFile.txt");

         // 
         for (int i = 0; i < output.length(); i++)
         {
            // Convert a character to Unicode.
            rawData = (int) output.charAt(i);
            // Write the Unicode.
            fwriter.write(rawData);
         }
         
         // Close the file.
         fwriter.close();
      }
      catch (IOException e)
      {
         System.out.println("Error: " +
                            e.getMessage());
      }
   }
}