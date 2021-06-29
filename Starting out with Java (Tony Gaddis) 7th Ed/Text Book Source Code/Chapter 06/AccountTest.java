import javax.swing.JOptionPane; // For the JOptionPane class

/**
   This program demonstrates the BankAccount class.
*/

public class AccountTest
{
   public static void main(String[] args)
   {
      String input;    // To hold user input

      // Get the starting balance.
      input = JOptionPane.showInputDialog(
                "What is your account's starting balance?");

      // Create a BankAccount object.
      BankAccount account = new BankAccount(input);

      // Get the amount of pay.
      input = JOptionPane.showInputDialog(
                "How much were you paid this month? ");

      // Deposit the user's pay into the account.
      account.deposit(input);

      // Display the new balance.
      JOptionPane.showMessageDialog(null,
         String.format("Your pay has been deposited.\n" +
                       "Your current balance is $%,.2f",
                       account.getBalance()));

      // Withdraw some cash from the account.
      input = JOptionPane.showInputDialog(
                "How much would you like to withdraw? ");
      account.withdraw(input);

      // Display the new balance
      JOptionPane.showMessageDialog(null,
         String.format("Now your balance is $%,.2f",
                       account.getBalance()));
                     
      System.exit(0);
   }
}
