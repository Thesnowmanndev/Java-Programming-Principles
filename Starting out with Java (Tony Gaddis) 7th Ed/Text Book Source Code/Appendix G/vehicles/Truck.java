package vehicles;

/**
   This class is in the vehicles package.
*/

public class Truck
{
   private double mpg;  // Fuel economy
   private double tons; // Hauling capacity

   /**
      Constructor
      @param mpg The truck's miles-per-gallon.
      @param tons The truck's hauling capacity
      in tons.
   */

   public Truck(double mpg, double tons)
   {
      this.mpg = mpg;
      this.tons = tons;
   }

   /**
      The toString method returns a string showing
      the fuel economy and hauling capacity.
      @return A reference to a String. 
   */

   public String toString()
   {
      return "Fuel economy: " + mpg +
             " miles per gallon" + 
             "\nHauling capacity: " +
             tons + " tons";
   }
}