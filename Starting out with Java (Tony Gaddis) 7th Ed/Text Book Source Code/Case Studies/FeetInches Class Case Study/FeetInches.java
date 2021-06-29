/**
   The FeetInches class holds distances measured in
   feet and inches.
*/

public class FeetInches
{
   private int feet;      // The number of feet
   private int inches;    // The number of inches

   /**
      This constructor assigns 0 to the feet
      and inches fields.
   */

   public FeetInches()
   { 
      feet = 0;
      inches = 0;
   }

   /**
      This constructor accepts two arguments which
      are assigned to the feet and inches fields.
      The simplify method is then called.
      @param f The value to assign to feet.
      @param i The value to assign to inches.
   */
     
   public FeetInches(int f, int i)
   { 
      feet = f;
      inches = i;
      simplify();
   }

   /**
      The following is a copy constructor. It accepts a
      reference to another FeetInches object. The feet
      and inches fields are set to the same values as
      those in the argument object.
      @param object2 The object to copy.
   */

   public FeetInches(FeetInches object2)
   {
      feet = object2.feet;
      inches = object2.inches;
   }

   /**
      The simplify method adjusts the values
      in feet and inches to conform to a 
      standard measurement.
   */

   private void simplify()
   {
      if (inches > 11)
      {
         feet = feet + (inches / 12);
         inches = inches % 12;
      }
   }

   /**
      The setFeet method assigns a value to 
      the feet field.
      @param f The value to assign to feet.
   */

   public void setFeet(int f)
   {
      feet = f; 
   }

   /**
      The setInches method assigns a value to 
      the inches field.
      @param i The value to assign to inches.
   */

   public void setInches(int i)
   {
      inches = i;
      simplify();
   }

   /**
      getFeet method
      @return The value in the feet field.
   */

   public int getFeet()
   {
      return feet;
   }

   /**
      getInches method
      @return The value in the inches field.
   */

   public int getInches()
   {
      return inches;
   }

   /**
      toString method
      @return a reference to a String stating
      the feet and inches.
   */

   public String toString()
   {
      String str = feet + " feet " + 
                   inches + " inches";
      return str;
   }

   /**
      The add method returns a FeetInches object
      that holds the sum of this object and another
      FeetInches object.
      @param object2 The other FeetInches object.
      @return A reference to a FeetInches object.
   */

   public FeetInches add(FeetInches object2)
   {
      int totalFeet,    // To hold the sum of feet
          totalInches;  // To hold the sum of inches

      totalFeet = feet + object2.feet;
      totalInches = inches + object2.inches;
      return new FeetInches(totalFeet, totalInches);
   }

   /**
      The equals method compares this object to the
      argument object. If both have the same values, 
      the method returns true.
      @return true if the objects are equal, false
      otherwise.
   */

   public boolean equals(FeetInches object2)
   {
      boolean status;

      if (object2 == null)
         status = false;      
      else if (feet == object2.feet && 
               inches == object2.inches)
          status = true;
      else
          status = false;
      return status;
   }

   /**
      The copy method makes a copy of the
      the calling object.
      @return A reference to the copy.
   */

   public FeetInches copy()
   {
      // Make a new FeetInches object and
      // initialize it with the same data
      // as the calling object.
      FeetInches newObject =
               new FeetInches(feet, inches);

      // Return a reference to the new object.
      return newObject;
   }
}
