/**
   This program demonstrates the conditional operator.
*/

import javax.swing.JOptionPane;  // Needed for JOptionPane

public class ConsultantCharges
{
   public static void main(String [] args)
   {
      double hours,     // To hold the hours worked
             charges;   // To hold the charges
      String input;     // To hold user input

      // Get the number of hours worked.
      input = JOptionPane.showInputDialog("How many hours were worked? ");
      hours = Double.parseDouble(input);

      // Make sure hours is at least 5.
      // In the following statement, if the value in hours is less
      // than 5, then 5 is stored in hours. Otherwise hours is assigned
      // the value it already has.
      hours = hours < 5 ? 5 : hours;

      // Calculate and display the charges. The variable hours will not
      // have a value less than 5 because of the previous statement.
      charges = 50.0 * hours;
      JOptionPane.showMessageDialog(null, "The charges are $" + charges);
      
      System.exit(0);
   }
}
