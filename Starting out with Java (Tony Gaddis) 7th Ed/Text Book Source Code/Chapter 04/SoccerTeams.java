import javax.swing.JOptionPane;

/**
   This program calculates the number of soccer teams
   that a youth league may create from the number of
   available players. Input validation is demonstrated
   with while loops.
*/

public class SoccerTeams
{
   public static void main(String[] args)
   {
      final int MIN_PLAYERS = 9;  // Minimum players per team
      final int MAX_PLAYERS = 15; // Maximum players per team
      int players;                // Number of available players
      int teamSize;               // Number of players per team
      int teams;                  // Number of teams
      int leftOver;               // Number of leftover players
      String input;               // To hold the user input

      // Get the number of players per team.
      input = JOptionPane.showInputDialog("Enter the number of " +
                                          "players per team.");
      teamSize = Integer.parseInt(input);
      
      // Validate the number entered.
      while (teamSize < MIN_PLAYERS || teamSize > MAX_PLAYERS)
      {
         input = JOptionPane.showInputDialog("The number must " +
                                   "be at least " + MIN_PLAYERS +
                                   " and no more than " +
                                   MAX_PLAYERS + ".\n Enter " +
                                   "the number of players.");
         teamSize = Integer.parseInt(input);
      }

      // Get the number of available players.
      input = JOptionPane.showInputDialog("Enter the available " +
                                          "number of players.");
      players = Integer.parseInt(input);
      
      // Validate the number entered.    
      while (players < 0)
      {
         input = JOptionPane.showInputDialog("Enter 0 or " +
                                             "greater.");
         players = Integer.parseInt(input);
      }
 
      // Calculate the number of teams.
      teams = players / teamSize; 

      // Calculate the number of leftover players.
      leftOver = players % teamSize;

      // Display the results.
      JOptionPane.showMessageDialog(null, "There will be " + 
                                    teams + " teams with " +
                                    leftOver + 
                                    " players left over.");
      System.exit(0);
   }
}
