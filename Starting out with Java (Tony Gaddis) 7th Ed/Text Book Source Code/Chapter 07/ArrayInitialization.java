/**
   This program shows an array being initialized.
*/

public class ArrayInitialization
{
   public static void main(String[] args)
   {
      int[] days = { 31, 28, 31, 30, 31, 30,
                     31, 31, 30, 31, 30, 31 };

      for (int index = 0; index < 12; index++)
      {
         System.out.println("Month " + (index + 1) +
                            " has " + days[index] +
                            " days.");
      }
   }
}
