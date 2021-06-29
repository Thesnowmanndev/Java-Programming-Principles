/**
   Compact Disc class
*/

public class CompactDisc implements RetailItem
{
   private String title;       // The CD's title
   private String artist;      // The CD's artist
   private double retailPrice; // The CD's retail price
   
   /**
      Constructor
      @param cdTitle The CD title.
      @param cdArtist The name of the artist.
      @param cdPrice The CD's price.
   */

   public CompactDisc(String cdTitle, String cdArtist, 
              double cdPrice)
   {
      title = cdTitle;
      artist = cdArtist;
      retailPrice = cdPrice;
   }
   
   /**
      getTitle method
      @return The CD's title.
   */

   public String getTitle()
   {
      return title;
   }
   
   /**
      getArtist method
      @return The name of the artist.
   */

   public String getArtist()
   {
      return artist;
   }

   /**
      getRetailPrice method (Required by the RetailItem
      interface)
      @return The retail price of the CD.
   */

   public double getRetailPrice()
   {
      return retailPrice;
   }
}