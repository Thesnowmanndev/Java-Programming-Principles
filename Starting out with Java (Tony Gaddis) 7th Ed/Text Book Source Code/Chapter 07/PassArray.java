import java.util.Scanner;  // Needed for Scanner class

/**
   This program demonstrates passing an array
   as an argument to a method.
*/

public class PassArray
{
   public static void main(String[] args)
   {
      final int ARRAY_SIZE = 4;  // Size of the array

      // Create an array.
      int[] numbers = new int[ARRAY_SIZE];

      // Pass the array to the getValues method.
      getValues(numbers);

      System.out.println("Here are the " +
                  "numbers that you entered:");

      // Pass the array to the showArray method.
      showArray(numbers);
   }

   /**
      The getValues method accepts a reference
      to an array as its argument. The user is
      asked to enter a value for each element.
      @param array A reference to the array.
   */

   private static void getValues(int[] array)
   {
      // Create a Scanner objects for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      System.out.println("Enter a series of " +
                    array.length + " numbers.");

      // Read values into the array
      for (int index = 0; index < array.length; index++)
      {
         System.out.print("Enter number " +
                          (index + 1) + ": ");
         array[index] = keyboard.nextInt();
      }
   }

   /**
      The showArray method accepts an array as
      an argument and displays its contents.
      @param array A reference to the array.
   */

   public static void showArray(int[] array)
   {
      // Display the array elements.
      for (int index = 0; index < array.length; index++)
         System.out.print(array[index] + " ");
   }
}