import java.io.*;
import java.util.Scanner;

/**
   This program uses the InventoryFile class to create a
   file containing data from 5 InventoryItem objects.
*/

public class CreateInventoryFile
{
   public static void main(String[] args) throws IOException
   {
      final int NUM_ITEMS = 5; // Number of items
      String description;      // Item description
      int units;               // Units on hand
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Create an array to hold InventoryItem objects.
      InventoryItem[] items = new InventoryItem[NUM_ITEMS];
      
      // Get data for the InventoryItem objects.
      System.out.println("Enter data for " + NUM_ITEMS +
                         " inventory items.");
                         
      for (int i = 0; i < items.length; i++)
      {
         // Get the description.
         System.out.print("Enter an item description: ");
         description = keyboard.nextLine();
         
         // Get the units on hand.
         System.out.print("Enter the number of units: ");
         units = keyboard.nextInt();
         
         // Consume the remaining newline.
         keyboard.nextLine();

         // Create an InventoryItem object in the array.
         items[i] = new InventoryItem(description, units);
      }
      
      // Create an InventoryFile object.
      InventoryItemFile file =
                   new InventoryItemFile("Inventory.dat");
      
      // Write the contents of the array to the file.
      for (int i = 0; i < items.length; i++)
      {
         file.writeInventoryItem(items[i]);
      }
      
      // Close the file.
      file.close();
      
      System.out.println("The data was written to the " +
                         "Inventory.dat file.");
   }
}
