import java.util.Scanner;

/**
   This program demonstrates the FeetInches class.
*/

public class DistanceDemo
{
   public static void main(String[] args)
   {
      int feet, inches;     // To hold feet and inches
      FeetInches distance;  // To reference a FeetInches object
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      // Get a distance in feet and inches.
      System.out.println("Enter a distance in feet "
                         + "and inches.");
      System.out.print("First enter the feet: ");
      feet = keyboard.nextInt();
      System.out.print("Now enter the inches: ");
      inches = keyboard.nextInt();

      // Create a FeetInches object, initialized with
      // the values entered by the user.
      distance = new FeetInches(feet, inches);

      // Display the object's contents.
      System.out.println("The distance you entered is "
                         + distance.toString());
   }
}

