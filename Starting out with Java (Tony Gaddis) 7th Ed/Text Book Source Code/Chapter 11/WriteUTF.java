/**
   This program opens a binary file and writes a series 
   of strings using UTF-8 encoding.
*/

import java.io.*;

public class WriteUTF
{
   public static void main(String[] args) throws IOException
   {
      String names[] = { "Warren", "Becky", "Holly", 
                         "Zach", "Chloe" };
      
      // Create the output objects.
      FileOutputStream fstream =
                new FileOutputStream("UTFnames.dat");
      DataOutputStream outputFile =
                new DataOutputStream(fstream);
      
      System.out.println("Writing the names to the file...");
      
      // Write the array elements to the file.
      for (int i = 0; i < names.length; i++)
         outputFile.writeUTF(names[i]);
      
      System.out.println("Done.");
      
      // Close the file.
      outputFile.close();     
   }
}
