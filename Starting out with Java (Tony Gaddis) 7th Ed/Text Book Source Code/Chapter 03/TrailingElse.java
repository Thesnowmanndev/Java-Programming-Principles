import javax.swing.JOptionPane;  // Needed for JOptionPane

/**
   This program asks the user to enter a numeric test
   score and displays a letter grade for the score. The
   program displays an error message if an invalid
   numeric score is entered.
*/

public class TrailingElse
{
   public static void main(String[] args)
   {
      int testScore;    // Numeric test score
      String input;     // To hold the user's input

      // Get the numeric test score.
      input = JOptionPane.showInputDialog("Enter your numeric " +
                     "test score and I will tell you the grade: ");
      testScore = Integer.parseInt(input);

      // Display the grade.
      if (testScore < 60)
         JOptionPane.showMessageDialog(null, "Your grade is F.");
      else if (testScore < 70)
         JOptionPane.showMessageDialog(null, "Your grade is D.");
      else if (testScore < 80)
         JOptionPane.showMessageDialog(null, "Your grade is C.");
      else if (testScore < 90)
         JOptionPane.showMessageDialog(null, "Your grade is B.");
      else if (testScore <= 100)
         JOptionPane.showMessageDialog(null, "Your grade is A.");
      else
         JOptionPane.showMessageDialog(null, "Invalid score.");
         
      System.exit(0);
   }
}
