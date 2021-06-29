import javax.swing.JOptionPane;

/**
   This program demonstrates how to use the String.format
   method to format a number as currency.
*/

public class CurrencyFormat3
{
   public static void main(String[] args)
   {
      double monthlyPay = 5000.0;
      double annualPay = monthlyPay * 12;

      JOptionPane.showMessageDialog(null,
          String.format("Your annual pay is $%,.2f\n", annualPay));
   }
}