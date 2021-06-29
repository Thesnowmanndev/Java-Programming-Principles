import java.util.ArrayList; // Needed for ArrayList class

/**
   This program demonstrates how to store BankAccount
   objects in an ArrayList.
*/

public class ArrayListDemo6
{
   public static void main(String[] args)
   {
      // Create an ArrayList to hold BankAccount objects.
      ArrayList<BankAccount> list = new ArrayList<BankAccount>();
      
      // Add three BankAccount objects to the ArrayList.
      list.add(new BankAccount(100.0));
      list.add(new BankAccount(500.0));
      list.add(new BankAccount(1500.0));
      
      // Display each item.
      for (int index = 0; index < list.size(); index++)
      {
         BankAccount account = list.get(index);
         System.out.println("Account at index " + index +
                      "\nBalance: " + account.getBalance());
      }      
   }
}