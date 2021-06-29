/**
   This program reads UTF-8 encoded strings from a binary file.
*/

import java.io.*;

public class ReadUTF
{
   public static void main(String[] args)
                      throws IOException
   {
      String name;
      boolean endOfFile = false;
      
      // Create the input objects.
      FileInputStream fstream =
                new FileInputStream("UTFnames.dat");
      DataInputStream inputFile =
                new DataInputStream(fstream);
      
      System.out.println("Reading the names from the file:");
      
      // Read the contents of the file.
      while (!endOfFile)
      {
           try
           {
                name = inputFile.readUTF();
                System.out.print(name + " ");
           }
           catch (EOFException e)
           {
                endOfFile = true;
           }
      }

      System.out.println("\nDone.");
      
      // Close the file.
      inputFile.close();     
   }
}
