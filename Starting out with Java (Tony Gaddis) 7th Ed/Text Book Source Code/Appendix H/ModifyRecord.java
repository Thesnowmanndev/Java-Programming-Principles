import java.io.*;
import java.util.Scanner;

/*
   This program allows the user to modify records in the
   Inventory.dat file.
*/

public class ModifyRecord
{
   public static void main(String[] args) throws IOException
   {
      int recordNumber;   // Record number
      int units;          // Units on hand
      String again;       // Want to change another one?
      String sure;        // Is the user sure?
      String description; // Item description
      InventoryItem item; // To reference an item
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Open the file.
      InventoryItemFile file = 
              new InventoryItemFile("Inventory.dat");
      
      // Report the number of records in the file.
      System.out.println("The Inventory.dat file has " +
                 file.getNumberOfRecords() + " records.");
      
      // Get a record number from the user and
      // allow the user to modify it.
      do
      {
         // Get the record number.
         System.out.print("Enter the number of the record " +
                          "you wish to modify: ");
         recordNumber = keyboard.nextInt();
         
         // Consume the remaining newline.
         keyboard.nextLine();
         
         // Move the file pointer to that record number.
         file.moveFilePointer(recordNumber);
         
         // Read the record at that location.
         item = file.readInventoryItem();
         
         // Display the existing contents.
         System.out.println("Existing data:");
         System.out.println("\nDescription: " +
                            item.getDescription());
         System.out.println("Units: " + item.getUnits());
         
         // Get the new data.
         System.out.print("\nEnter the new description: ");
         description = keyboard.nextLine();
         System.out.print("Enter the number of units: ");
         units = keyboard.nextInt();
         keyboard.nextLine(); // Consume the remaining newline.
         
         // Store the new data in the object.
         item.setDescription(description);
         item.setUnits(units);
         
         // Make sure the user wants to save this data.
         System.out.print("Are you sure you want to save " +
                          "this data? (Y/N) ");
         sure = keyboard.nextLine();
         if (sure.charAt(0) == 'Y' || sure.charAt(0) == 'y')
         {
            // Move back to the record's starting position.
            file.moveFilePointer(recordNumber);
            // Save the new data.
            file.writeInventoryItem(item);
         }
         
         // Ask the user whether to change another record.
         System.out.print("\nDo you want to modify another " +
                          "record? (Y/N): ");
         again = keyboard.nextLine();
      } while (again.charAt(0) == 'Y' || again.charAt(0) == 'y');
      
      // Close the file.
      file.close();
   }
}
