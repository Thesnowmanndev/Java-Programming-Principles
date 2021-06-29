import javax.swing.JOptionPane;

/**
   This program demonstrates how a method
   can return a reference to an object.
*/

public class ReturnObject
{
   public static void main(String[] args)
   {
      BankAccount account;

      // Get a reference to a BankAccount object.
      account = getAccount();
      
      // Display the account's balance.
      JOptionPane.showMessageDialog(null,
              "The account has a balance of $" +
              account.getBalance());

      System.exit(0);
   }

   /**
      The getAccount method creates a BankAccount
      object with the balance specified by the
      user.
      @return A reference to the object.
   */
   
   public static BankAccount getAccount()
   {
      String input;   // To hold input
      double balance; // Account balance

      // Get the balance from the user.
      input = JOptionPane.showInputDialog("Enter " +
                             "the account balance.");
      balance = Double.parseDouble(input);
      
      // Create a BankAccount object and return
      // a reference to it.
      return new BankAccount(balance);
   }
}