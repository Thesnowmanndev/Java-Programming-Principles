/**
   This program demonstrates a simple
   lambda expression.
*/

import java.util.Scanner;

public class LambdaDemo
{
   public static void main(String[] args)
   {
      int num;
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Create an object that implements IntCalculator.
      IntCalculator square = x -> x * x;

      // Get a number from the user.
      System.out.print("Enter an integer number: ");
      num = keyboard.nextInt();
      
      // Display the square of the number.
      System.out.println("The square is " + square.calculate(num)); 
   }
}
