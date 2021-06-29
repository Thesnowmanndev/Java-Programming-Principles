/**
   This class demonstrates static methods.
*/

public class Metric
{
   /**
      The milesToKilometers method converts a
      distance in miles to kilometers.
      @param m The distance in miles.
      @return The distance in kilometers.
   */

   public static double milesToKilometers(double m)
   {
      return m * 1.609;
   }

   /**
      The kilometersToMiles method converts
      a distance in kilometers to miles.
      @param k The distance in kilometers.
      @return The distance in miles.
   */
   
   public static double kilometersToMiles(double k)
   {
      return k / 1.609;
   }
}