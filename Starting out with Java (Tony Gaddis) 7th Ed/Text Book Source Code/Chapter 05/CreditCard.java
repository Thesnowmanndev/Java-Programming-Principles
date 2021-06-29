import javax.swing.JOptionPane;

/**
   This program uses two void methods.
*/

public class CreditCard
{
   public static void main(String[] args)
   {
      double salary;    // Annual salary
      int creditRating; // Credit rating
      String input;     // To hold the user's input
      
      // Get the user's annual salary.
      input = JOptionPane.showInputDialog("What is " +
                                "your annual salary?");
      salary = Double.parseDouble(input);

      // Get the user's credit rating (1 through 10).
      input = JOptionPane.showInputDialog("On a scale of " +
             "1 through 10, what is your credit rating?\n" +
             "(10 = excellent, 1 = very bad)");
      creditRating = Integer.parseInt(input);
      
      // Determine whether the user qualifies.
      if (salary >= 20000 && creditRating >= 7)
         qualify();
      else
         noQualify();
         
      System.exit(0);
   }
   
   /**
      The qualify method informs the user that he
      or she qualifies for the credit card.
   */
   
   public static void qualify()
   {
      JOptionPane.showMessageDialog(null, "Congratulations! " +
                            "You qualify for the credit card!");
   }

   /**
      The noQualify method informs the user that he
      or she does not qualify for the credit card.
   */
   
   public static void noQualify()
   {
      JOptionPane.showMessageDialog(null, "I'm sorry.  You " +
                        "do not qualify for the credit card.");   
   }
}
