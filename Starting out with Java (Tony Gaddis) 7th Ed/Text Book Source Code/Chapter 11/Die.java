import java.util.Random;

/**
   The Die class simulates a six-sided die.
*/

public class Die
{
   private final int MIN_SIDES = 4;
   private int sides;   // Number of sides
   private int value;   // The die's value
   
   /**
      The constructor performs an initial
      roll of the die.
      @param numSides The number of sides for this die.
   */
   
   public Die(int numSides)
   {
      // Validate the number of sides.
      if (numSides < MIN_SIDES)
      {
         throw new IllegalArgumentException(
            "The die must have at least " +
            MIN_SIDES + " sides.");
      }
      
      // Store the number of sides and roll.
      sides = numSides;
      roll();
   }
   
   /**
      The roll method simlates the rolling of
      the die.
   */
   
   public void roll()
   {
      // Create a Random object.
      Random rand = new Random();
      
      // Get a random value for the die.
      value = rand.nextInt(sides) + 1;
   }
   
   /**
      getSides method
      @return The number of sides for this die.
   */
   
   public int getSides()
   {
      return sides;
   }
   
   /**
      getValue method
      @return The value of the die.
   */
   
   public int getValue()
   {
      return value;
   }
}