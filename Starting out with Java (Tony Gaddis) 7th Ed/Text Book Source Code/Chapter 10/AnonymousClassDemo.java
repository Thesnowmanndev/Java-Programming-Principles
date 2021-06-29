/**
   This program demonstrates an anonymous inner class
*/

import java.util.Scanner;

public class AnonymousClassDemo
{
   public static void main(String[] args)
   {
      int num;
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Create an object that implements IntCalculator.
      IntCalculator square = new IntCalculator() {
         public int calculate(int number)
         {
            return number * number;
         }};

      // Get a number from the user.
      System.out.print("Enter an integer number: ");
      num = keyboard.nextInt();
      
      // Display the square of the number.
      System.out.println("The square is " + square.calculate(num));      
   }
}