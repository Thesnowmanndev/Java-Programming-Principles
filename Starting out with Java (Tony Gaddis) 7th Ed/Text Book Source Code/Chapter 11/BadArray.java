/**
   This program causes an error and crashes.
*/

public class BadArray
{
   public static void main(String[] args)
   {
      // Create an array with 3 elements.
      int[] numbers = { 1, 2, 3 };

      // Attempt to read beyond the bounds
      // of the array.
      for (int i = 0; i <= 3; i++)
         System.out.println(numbers[i]);
   }
}
