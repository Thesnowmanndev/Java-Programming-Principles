/**
   This program demonstrates a lambda expression
   that uses a final local variable.
*/

import java.util.Scanner;

public class LambdaDemo2
{
   public static void main(String[] args)
   {
      final int factor = 10;
      int num;
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Create an object that implements IntCalculator.
      IntCalculator multiplier = x -> x * factor;

      // Get a number from the user.
      System.out.print("Enter an integer number: ");
      num = keyboard.nextInt();
      
      // Display the number multiplied by 10.
      System.out.println("Multiplied by 10, that number is " +  
                         multiplier.calculate(num));      
   }
}
