import java.io.*;
import java.util.Scanner;

/**
   This program serializes the objects in an array of
   BankAccount2 objects.
*/

public class SerializeObjects
{
   public static void main(String[] args)
                      throws IOException
   {
      double balance;            // An account balance
      final int NUM_ITEMS = 3;   // Number of accounts
  
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
            
      // Create a BankAccount2 array
      BankAccount2[] accounts =
                    new BankAccount2[NUM_ITEMS];
      
      // Populate the array.
      for (int i = 0; i < accounts.length; i++)
      {
         // Get an account balance.
         System.out.print("Enter the balance for " +
                          "account " + (i + 1) + ": ");
         balance = keyboard.nextDouble();

         // Create an object in the array.
         accounts[i] = new BankAccount2(balance);
      }
      
      // Create the stream objects.
      FileOutputStream outStream = 
                new FileOutputStream("Objects.dat");
      ObjectOutputStream objectOutputFile = 
                new ObjectOutputStream(outStream);
      
      // Write the serialized objects to the file.
      for (int i = 0; i < accounts.length; i++)
      {
         objectOutputFile.writeObject(accounts[i]);
      }
      
      // Close the file.
      objectOutputFile.close();
      
      System.out.println("The serialized objects " +
            "were written to the Objects.dat file.");
   }
}
