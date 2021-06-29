import javax.swing.JOptionPane;

/**
   This program demonstrates using dialogs with 
   JOptionPane.
*/

public class PayrollDialog
{
   public static void main(String[] args)
   {
      String inputString; // For reading input
      String name;        // The user's name
      int hours;          // The number of hours worked
      double payRate;     // The user's hourly pay rate
      double grossPay;    // The user's gross pay

      // Get the user's name.
      name = JOptionPane.showInputDialog("What is " +
                                         "your name? ");
      
      // Get the hours worked.
      inputString =
        JOptionPane.showInputDialog("How many hours " +
                             "did you work this week? ");

      // Convert the input to an int.
      hours = Integer.parseInt(inputString);
      
      // Get the hourly pay rate.
      inputString =
         JOptionPane.showInputDialog("What is your " +
                                   "hourly pay rate? ");

      // Convert the input to a double.
      payRate = Double.parseDouble(inputString);
      
      // Calculate the gross pay.
      grossPay = hours * payRate;
      
      // Display the results.
      JOptionPane.showMessageDialog(null, "Hello " + 
                    name + ". Your gross pay is $" +
                    grossPay);

      // End the program.
      System.exit(0);
   }
}