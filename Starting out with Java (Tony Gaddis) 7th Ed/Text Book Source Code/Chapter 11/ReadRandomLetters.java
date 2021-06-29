import java.io.*;

/**
   This program uses the RandomAccessFile class to open
   the file Letters.dat and randomly read letters from
   different locations.
*/

public class ReadRandomLetters
{
   public static void main(String[] args) throws IOException
   {
      final int CHAR_SIZE = 2;// 2 byte characters
      long byteNum;           // The byte number
      char ch;                // A character from the file
      
      // Open the file for reading.
      RandomAccessFile randomFile =
                  new RandomAccessFile("Letters.dat", "r");
      
      // Move to the character 5. This is the 6th 
      // character from the beginning of the file.
      byteNum = CHAR_SIZE * 5;
      randomFile.seek(byteNum);
      
      // Read the character stored at this location
      // and display it. Should be the letter f.
      ch = randomFile.readChar();
      System.out.println(ch);
      
      // Move to character 10 (the 11th character),
      // read the character, and display it.
      // Should be the letter k.
      byteNum = CHAR_SIZE * 10;
      randomFile.seek(byteNum);
      ch = randomFile.readChar();
      System.out.println(ch);
      
      // Move to character 3 (the 4th character),
      // read the character, and display it.
      // Should be the letter d.
      byteNum = CHAR_SIZE * 3;
      randomFile.seek(byteNum);
      ch = randomFile.readChar();
      System.out.println(ch);
      
      // Close the file.
      randomFile.close();
   }
}