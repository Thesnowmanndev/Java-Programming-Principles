/**
   This class simulates rolling a pair of dice 10,000 times and
   counts the number of times doubles of are rolled for each different
   pair of doubles.
*/

import java.util.Random;		//to use the random number generator 
public class DiceSimulation
{
	public static void main(String[] args)
	{
		final int NUMBER = 10000;	//the number of times to roll the dice

		//a random number generator used in simulating rolling a dice
		Random generator = new Random();
		
		int die1Value;      	// number of spots on the first die
		int die2Value;      	// number of spots on the second die
		int count = 0;	     	// number of times the dice were rolled
		int snakeEyes = 0;  	// number of times snake eyes is rolled
		int twos = 0;			// number of times double two is rolled
		int threes = 0;		// number of times double three is rolled
		int fours = 0;			// number of times double four is rolled
		int fives = 0;			// number of times double five is rolled
		int sixes = 0;			// number of times double six is rolled

		//ENTER YOUR CODE FOR THE ALGORITHM HERE

		System.out.println ("You rolled snake eyes " + snakeEyes +
			" out of " + count + " rolls.");
		System.out.println ("You rolled double twos " + twos +
			" out of " + count + " rolls.");
		System.out.println ("You rolled double threes " + threes +
			" out of " + count + " rolls.");
		System.out.println ("You rolled double fours " + fours +
			" out of " + count + " rolls.");
		System.out.println ("You rolled double fives " + fives +
			" out of " + count + " rolls.");
		System.out.println ("You rolled double sixes " + sixes +
			" out of " + count + " rolls.");
	}
}