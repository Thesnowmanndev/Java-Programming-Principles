/**
   This program demonstrates how the Die class throws
   an exception when an invalid value is passed to the
   constructor.
*/

public class DiceExceptionDemo
{
   public static void main(String[] args)
   {
      final int DIE_SIDES = 1;  // Number of sides
      
      // Create an instance of the Die class.
      Die die = new Die(DIE_SIDES);
      
      System.out.println("Initial value of the die:");
      System.out.println(die.getValue());
   }
}