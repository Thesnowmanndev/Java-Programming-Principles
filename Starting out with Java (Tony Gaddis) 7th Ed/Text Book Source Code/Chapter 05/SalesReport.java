import java.util.Scanner;        // For the Scanner class
import java.io.*;                // For file I/O classes
import javax.swing.JOptionPane;  // For the JOptionPane class

/**
   This program opens a file containing the sales
   amounts for 30 days. It calculates and displays
   the total sales and average daily sales.
*/

public class SalesReport
{
   public static void main(String[] args) throws IOException
   {
      final int NUM_DAYS = 30; // Number of days of sales
      String filename;         // The name of the file to open
      double totalSales;       // Total sales for period
      double averageSales;     // Average daily sales
      
      // Get the name of the file.
      filename = getFileName();
      
      // Get the total sales from the file.
      totalSales = getTotalSales(filename);
      
      // Calculate the average.
      averageSales = totalSales / NUM_DAYS;
      
      // Display the total and average.
      displayResults(totalSales, averageSales);
      
      System.exit(0);
   }

   /**
      The getFileName method prompts the user to enter
      the name of the file to open.
      @return A reference to a String object containing
              the name of the file.
   */
   
   public static String getFileName()
   {
      String file;   // To hold the file name
      
      // Prompt the user to enter a file name.
      file = JOptionPane.showInputDialog(
               "Enter the name of the file\n" +
               "containing 30 days of sales amounts.");

      // Return the name.
      return file;
   }     
      
   /**
      The getTotalSales method opens a file and
      reads the daily sales amounts, accumulating
      the total. The total is returned.
      @param filename The name of the file to open.
      @return The total of the sales amounts.
   */
   
   public static double getTotalSales(String filename)throws IOException
   {
      double total = 0.0;  // Accumulator
      double sales;        // A daily sales amount

      // Open the file.
      File file = new File(filename);
      Scanner inputFile = new Scanner(file);
      
      // This loop processes the lines read from the file,
      // until the end of the file is encountered.
      while (inputFile.hasNext())
      {
         // Read a double from the file.
         sales = inputFile.nextDouble();
         
         // Add sales to the value already in total.
         total += sales;
      }
      
      // Close the file.
      inputFile.close();
      
      // Return the total sales.
      return total;
   }
   
   /**
      The displayResults method displays the total and
      average daily sales.
      @param total The total sales.
      @param avg The average daily sales.
   */
   
   public static void displayResults(double total, double avg)
   {
      // Display the formatted total and average sales.
      JOptionPane.showMessageDialog(null,
         String.format("The total sales for the period is $%,.2f\n" +
                       "The average daily sales were $%,.2f",
                       total, avg));
   }
}
