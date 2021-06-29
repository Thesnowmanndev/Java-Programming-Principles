/**
   This program demonstrates the selectionSort method
   in the ArrayTools class.
*/

public class SelectionSortDemo
{
   public static void main(String[] arg)
   {
      int[] values = {5, 7, 2, 8, 9, 1};

      // Display the unsorted array.
      System.out.println("The unsorted values are:");
      for (int i = 0; i < values.length; i++)
         System.out.print(values[i] + " ");
      System.out.println();

      // Sort the array.
      selectionSort(values);

      // Display the sorted array.
      System.out.println("The sorted values are:");
      for (int i = 0; i < values.length; i++)
         System.out.print(values[i] + " ");
      System.out.println();

   }

   /**
      The selectionSort method performs a selection sort on an
      int array. The array is sorted in ascending order.
      @param array The array to sort.
   */

   public static void selectionSort(int[] array)
   {
      int startScan, index, minIndex, minValue;

      for (startScan = 0; startScan < (array.length-1); startScan++)
      {
         minIndex = startScan;
         minValue = array[startScan];
         for(index = startScan + 1; index < array.length; index++)
         {
            if (array[index] < minValue)
            {
               minValue = array[index];
               minIndex = index;
            }
         }
         array[minIndex] = array[startScan];
         array[startScan] = minValue;
      }
   }
}
