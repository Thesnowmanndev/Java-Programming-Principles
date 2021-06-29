/**
   This program demonstrates a method that
   accepts two arguments.
*/

public class TwoArgs2
{
   public static void main(String[] args)
   {
      double a = 4.5;
      double b = 6.9;
      
      showSum(a, b);
   }
   
   /**
      The showSum method displays the sum of two numbers.
      @param num1 The first number.
      @param num2 The second number.
   */

   
   public static void showSum(double num1, double num2)
   {
      double sum;    // To hold the sum
      
      sum = num1 + num2;
      System.out.println("The sum is " + sum);
   }
}