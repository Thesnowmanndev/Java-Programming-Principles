import java.io.*;

/**
   This program deserializes the objects in the Objects.dat
   file and stores them in an array.                        
*/

public class DeserializeObjects
{
   public static void main(String[] args)
                      throws Exception
   {
      double balance;            // An account balance
      final int NUM_ITEMS = 3;   // Number of accounts
  
      // Create the stream objects.
      FileInputStream inStream = 
                 new FileInputStream("Objects.dat");
      ObjectInputStream objectInputFile = 
                 new ObjectInputStream(inStream);

      // Create a BankAccount2 array
      BankAccount2[] accounts =
                    new BankAccount2[NUM_ITEMS];
      
      // Read the serialized objects from the file.
      for (int i = 0; i < accounts.length; i++)
      {
         accounts[i] =
           (BankAccount2) objectInputFile.readObject();
      }
      
      // Close the file.
      objectInputFile.close();
      
      // Display the objects.
      for (int i = 0; i < accounts.length; i++)
      {
         System.out.println("Account " + (i + 1) +
                 " $ " + accounts[i].getBalance());
      }
   }
}
