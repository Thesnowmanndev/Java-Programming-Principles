import java.util.Scanner;

/**
   This program demonstrates a two-dimensional array.
*/

public class CorpSales
{
   public static void main(String[] args)
   {
      final int DIVS = 3; // Three divisions in the company
      final int QTRS = 4; // Four quarters
      double totalSales = 0.0;  // Accumulator

      // Create an array to hold the sales for each
      // division, for each quarter.
      double[][] sales = new double[DIVS][QTRS];

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      // Display an introduction.
      System.out.println("This program will calculate the " +
                         "total sales of");
      System.out.println("all the company's divisions. " +
                         "Enter the following sales data:");

      // Nested loops to fill the array with quarterly
      // sales figures for each division.
      for (int div = 0; div < DIVS; div++)
      {
         for (int qtr = 0; qtr < QTRS; qtr++)
         {
            System.out.printf("Division %d, Quarter %d: $",
                              (div + 1), (qtr + 1));
            sales[div][qtr] = keyboard.nextDouble();
         }
         System.out.println();   // Print blank line.
      }

      // Nested loops to add all the elements of the array.
      for (int div = 0; div < DIVS; div++)
      {
         for (int qtr = 0; qtr < QTRS; qtr++)
         {
            totalSales += sales[div][qtr];
         }
      }

      // Display the total sales.
      System.out.printf("Total company sales: $%,.2f\n",
                        totalSales);
   }
}