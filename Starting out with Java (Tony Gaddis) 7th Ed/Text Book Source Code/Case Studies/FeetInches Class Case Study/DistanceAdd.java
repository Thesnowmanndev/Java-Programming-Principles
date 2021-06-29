/**
   This program uses the FeetInches class's add method
   to add two distances.
*/

public class DistanceAdd
{
   public static void main(String[] args)
   {
      // Create a FeetInches object holding 5 feet, 9 inches.
      FeetInches distance1 = new FeetInches(5, 9);
      
      // Create a FeetInches object holding 2 feet, 5 inches.
      FeetInches distance2 = new FeetInches(2, 5);
      
      // Declare a FeetInches variable that does not
      // reference an object.
      FeetInches distance3;

      // Add distance 1 and distance 2, store the
      // result in distance3.
      distance3 = distance1.add(distance2);

      // Display the results.
      System.out.println("The first distance is " + distance1);
      System.out.println("The second distance is " + distance2);
      System.out.println("The sum of these distances is " + distance3);
   }
}
