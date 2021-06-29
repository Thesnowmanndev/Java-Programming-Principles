import java.util.Scanner; // Needed for the Scanner class

/**
   This program works with an array of three
   BankAccount objects.
*/

public class ObjectArray
{
   public static void main(String[] args)
   {
      final int NUM_ACCOUNTS = 3;  // Number of accounts
      
      // Create an array that can reference
      // BankAccount objects.
      BankAccount[] accounts = new BankAccount[NUM_ACCOUNTS];

      // Create objects for the array.
      createAccounts(accounts);

      // Display the balances of each account.
      System.out.println("Here are the balances " +
                         "for each account:");

      for (int index = 0; index < accounts.length; index++)
      {
         System.out.println("Account " + (index + 1) +
                   ": $" + accounts[index].getBalance());
      }
   }

   /**
      The createAccounts method creates a BankAccount
      object for each element of an array. The user
      is asked for each account's balance.
      @param array The array to reference the accounts
   */

   private static void createAccounts(BankAccount[] array)
   {
      double balance;  // To hold an account balance

      // Create a Scanner object.
      Scanner keyboard = new Scanner(System.in);

      // Create the accounts.
      for (int index = 0; index < array.length; index++)
      {
         // Get the account's balance.
         System.out.print("Enter the balance for " +
                          "account " + (index + 1) + ": ");
         balance = keyboard.nextDouble();

         // Create the account.
         array[index] = new BankAccount(balance);
      }
   }
}