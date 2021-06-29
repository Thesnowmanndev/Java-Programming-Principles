/**
   This program displays a variety of
   numbers left-justified in columns.
*/

public class LeftJustified
{
   public static void main(String[] args)
   {
      // Declare a variety of int variables.
      int num1 = 123;
      int num2 = 12;
      int num3 = 45678;
      int num4 = 456;
      int num5 = 1234567;
      int num6 = 1234;
      
      // Display each variable left-justified
      // in a field of 8 spaces.
      System.out.printf("%-8d%-8d\n", num1, num2);
      System.out.printf("%-8d%-8d\n", num3, num4);
      System.out.printf("%-8d%-8d\n", num5, num6);
   }
}