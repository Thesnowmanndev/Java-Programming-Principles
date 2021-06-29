import java.util.Scanner;

/**
   This program displays a triangle pattern.
*/

public class TrianglePattern
{
   public static void main(String[] args)
   {
      final int BASE_SIZE = 8;
      
      for (int r = 0; r < BASE_SIZE; r++)
      {
         for (int c = 0; c < (r+1); c++)
         {
            System.out.print("*");
         }
         System.out.println();
      }
   }
}