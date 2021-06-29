package vehicles;

/**
   This class is in the vehicles package.
*/

public class Car
{
   private int passengers;  // Number of passengers
   private double topSpeed; // Top speed

   /**
      Constructor
      @param passengers The number of passengers.
      @param topSpeed The car's top speed.
   */

   public Car(int passengers, double topSpeed)
   {
      this.passengers = passengers;
      this.topSpeed = topSpeed;
   }

   /**
      The toString method returns a string showing
      the number of passengers and top speed.
      @return A reference to a String. 
   */

   public String toString()
   {
      return "Passengers: " + passengers +
             "\nTop speed: " + topSpeed +
             " miles per hour";
   }
}