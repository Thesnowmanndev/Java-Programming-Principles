/**
   InventoryItem class
*/

public class InventoryItem
{
   private String description; // Item description
   private int units;          // Units on hand

   /**
      This constructor assigns an empty string
      to description and 0 to units.
   */

   public InventoryItem()
   {
      description = "";
      units = 0;
   }

   /**
      This constructor assigns values
      to the description and units fields.
      @param d The description.
      @param u The units on hand.
   */

   public InventoryItem(String d, int u)
   {
      description = d;
      units = u;
   }

   /**
      The setDescription method assigns a string
      to the description field.
      @param d The string to assign to description.
   */
   
   public void setDescription(String d)
   {
      description = d;
   }

   /**
      The setUnits method assigns a value
      to the units field.
      @param u The value to assign to units.
   */

   public void setUnits(int u)
   {
      units = u;
   }

   /**
      The getDescription method returns the item's
      description.
      @return The description field.
   */

   public String getDescription()
   {
      return description;
   }

   /**
      The getUnits method returns the number of
      units on hand.
      @return The units field.
   */
   
   public int getUnits()
   {
      return units;
   }
}
