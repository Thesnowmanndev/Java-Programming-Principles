/**
   This program demonstrates that an interface type may
   be used to create a polymorphic reference.
*/

public class PolymorphicInterfaceDemo
{
   public static void main(String[] args)
   {
      // Create a CompactDisc object.
      CompactDisc cd =
              new CompactDisc("Greatest Hits",
                              "Joe Looney Band",
                              18.95);
      // Create a DvdMovie object.
      DvdMovie movie =
              new DvdMovie("Wheels of Fury",
                           137, 12.95);

      // Display the CD's title.                      
      System.out.println("Item #1: " +
                         cd.getTitle());
                         
      // Display the CD's price.
      showPrice(cd);
      
      // Display the DVD's title.
      System.out.println("Item #2: " +
                         movie.getTitle());
                         
      // Display the DVD's price.
      showPrice(movie);
   }

   /**
      The showPrice method displays the price
      of a RetailItem object.
      @param item A reference to a RetailItem object.
   */
   
   private static void showPrice(RetailItem item)
   {
      System.out.printf("Price: $%,.2f\n", item.getRetailPrice());
   }
}
