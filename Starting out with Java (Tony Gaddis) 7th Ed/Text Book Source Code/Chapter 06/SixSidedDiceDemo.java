/**
	This program simulates the rolling of dice.
*/

public class SixSidedDiceDemo
{
	public static void main(String[] args)
	{
		final int DICE_SIDES = 6; // Number of sides for each die
		final int MAX_ROLLS = 5;  // Number of times to roll
		
		// Create two instances of the Die class.
		Die die1 = new Die(DICE_SIDES);
		Die die2 = new Die(DICE_SIDES);
		
		// Display the initial state of the dice.
		System.out.println("Initial value of the dice:");
		System.out.println(die1.getValue() + " " + die2.getValue());
		
		// Roll the dice five times.
		System.out.println("I will roll the dice " + 
		                   MAX_ROLLS + " times.");
								 
		for (int i = 0; i < MAX_ROLLS; i++)
		{
			// Roll the dice.
			die1.roll();
			die2.roll();
			
			// Display the values of the dice.
			System.out.println(die1.getValue() + " " + die2.getValue());
		}
	}
}