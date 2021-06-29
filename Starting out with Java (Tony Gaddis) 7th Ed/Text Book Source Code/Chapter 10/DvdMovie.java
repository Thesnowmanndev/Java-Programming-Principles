/**
   DvdMovie class
*/

public class DvdMovie implements RetailItem
{
   private String title;       // The DVD's title
   private int runningTime;    // Running time in minutes
   private double retailPrice; // The DVD's retail price
   
   /**
      Constructor
      @param dvdTitle The DVD title.
      @param runTime The running time in minutes.
      @param dvdPrice The DVD's price.
   */

   public DvdMovie(String dvdTitle, int runTime,
                                double dvdPrice)
   {
      title = dvdTitle;
      runningTime = runTime;
      retailPrice = dvdPrice;
   }
   
   /**
      getTitle method
      @return The DVD's title.
   */

   public String getTitle()
   {
      return title;
   }
   
   /**
      getRunningTime method
      @return The running time in minutes.
   */

   public int getRunningTime()
   {
      return runningTime;
   }

   /**
      getRetailPrice method (Required by the RetailItem
      interface)
      @return The retail price of the DVD.
   */

   public double getRetailPrice()
   {
      return retailPrice;
   }
}