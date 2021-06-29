import java.util.Scanner;

/**
   This program demonstrates the binary search method in
   the ArrayTools class.
*/

public class BinarySearchDemo
{
   public static void main(String[] args)
   {
      // The values in the following array are sorted
      // in ascending order.
      int numbers[] = {101, 142, 147, 189, 199, 207, 222,
                       234, 289, 296, 310, 319, 388, 394,
                       417, 429, 447, 521, 536, 600};
      int result, searchValue;
		String input;
      
      // Create the console input objects.
		Scanner keyboard = new Scanner(System.in);

      do
      {
         // Get a value to search for.
         System.out.print("Enter a value to search for: ");
         searchValue = keyboard.nextInt();

         // Search for the value
         result = binarySearch(numbers, searchValue);

        // Display the results.
        if (result == -1)
           System.out.println(searchValue + " was not found.");
        else
        {
           System.out.println(searchValue + " was found at " +
                              "element " + result);
        }

		  // Consume the remaining newline.
		  keyboard.nextLine();
		  
        // Does the user want to search again?
        System.out.print("Do you want to search again? (Y or N): ");
        input = keyboard.nextLine();
      } while (input.charAt(0) == 'y' || input.charAt(0) == 'Y');
   }

   /**
      The binarySearch method performs a binary search on an
      integer array. The array is searched for the number passed
      to value. If the number is found, its array subscript is
      returned. Otherwise, -1 is returned indicating the value was
      not found in the array.
      @param array The array to search.
      @param value The value to search for.
   */

   public static int binarySearch(int[] array, int value)
   {
      int first;       // First array element
      int last;        // Last array element
      int middle;      // Midpoint of search
      int position;    // Position of search value
      boolean found;   // Flag

      // Set the inital values.
      first = 0;
      last = array.length - 1;
      position = -1;
      found = false;

      // Search for the value.
      while (!found && first <= last)
      {
         // Calculate midpoint
         middle = (first + last) / 2;
         
         // If value is found at midpoint...
         if (array[middle] == value)
         {
            found = true;
            position = middle;
         }
         // else if value is in lower half...
         else if (array[middle] > value)
            last = middle - 1;
         // else if value is in upper half....
         else
            first = middle + 1;
      }

      // Return the position of the item, or -1
      // if it was not found.
      return position;
   }
}
