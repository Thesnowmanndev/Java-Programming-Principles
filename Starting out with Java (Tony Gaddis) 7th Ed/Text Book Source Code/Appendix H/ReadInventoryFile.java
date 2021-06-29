import java.io.*;
import java.util.Scanner;

/**
   This program displays specified records from
   the Inventory.dat file.
*/

public class ReadInventoryFile
{
   public static void main(String[] args) throws IOException
   {
      int recordNumber;     // Record number
      String again;         // To get a Y or an N
      InventoryItem item;   // An object from the file
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Open the file.
      InventoryItemFile file = 
              new InventoryItemFile("Inventory.dat");
      
      // Report the number of records in the file.
      System.out.println("The Inventory.dat file has " +
                 file.getNumberOfRecords() + " records.");
      
      // Get a record number from the user and
      // display the record.
      do
      {
         // Get the record number.
         System.out.print("Enter the number of the record " +
                          "you wish to see: ");
         recordNumber = keyboard.nextInt();
         
         // Consume the remaining newline.
         keyboard.nextLine();
         
         // Move the file pointer to that record.
         file.moveFilePointer(recordNumber);
         
         // Read the record at that location.
         item = file.readInventoryItem();
         
         // Display the record.
         System.out.println("\nDescription: " +
                            item.getDescription());
         System.out.println("Units: " + item.getUnits());
         
         // Ask the user whether to get another record.
         System.out.print("\nDo you want to see another " +
                          "record? (Y/N): ");
         again = keyboard.nextLine();
      } while (again.charAt(0) == 'Y' || again.charAt(0) == 'y');
      
      // Close the file.
      file.close();
   }
}
