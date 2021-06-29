/**
	This program uses the FeetInches class's equals
	method to compare two distances.
*/

public class DistanceCompare
{
   public static void main(String[] args)
   {
      // Create a FeetInches object holding 5 feet, 9 inches.  
      FeetInches distance1 = new FeetInches(5, 9);
      
      // Create a FeetInches object holding 5 feet, 9 inches.
      FeetInches distance2 = new FeetInches(5, 9);
      
      // Create a FeetInches object holding 7 feet, 4 inches.
      FeetInches distance3 = new FeetInches(7, 4);

      // Display the distances.
      System.out.println("The first distance is " + distance1);
      System.out.println("The second distance is " + distance2);
      System.out.println("The third distance is " + distance3);

      // Compare distance1 and distance2.
      if (distance1.equals(distance2))
         System.out.println("distances 1 and 2 are the same.");
      else
          System.out.println("distances 1 and 2 are not the same.");

      // Compare distance1 and distance3.
      if (distance1.equals(distance3))
         System.out.println("distances 1 and 3 are the same.");
      else
          System.out.println("distances 1 and 3 are not the same.");
   }
}
