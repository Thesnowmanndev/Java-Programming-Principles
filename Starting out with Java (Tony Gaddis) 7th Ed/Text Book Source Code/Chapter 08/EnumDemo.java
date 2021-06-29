/**
   This program demonstrates an enumerated type.
*/

public class EnumDemo
{
   // Declare the Day enumerated type.
   enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
              THURSDAY, FRIDAY, SATURDAY }

   public static void main(String[] args)
   {
      // Declare a Day variable and assign it a value.
      Day workDay = Day.WEDNESDAY;
      
      // The following statement displays WEDNESDAY.
      System.out.println(workDay);
      
      // The following statement displays the ordinal
      // value for Day.SUNDAY, which is 0.
      System.out.println("The ordinal value for " +
                         Day.SUNDAY + " is " +
                         Day.SUNDAY.ordinal());
      
      // The following statement displays the ordinal
      // value for Day.SATURDAY, which is 6.
      System.out.println("The ordinal value for " +
                         Day.SATURDAY + " is " +
                         Day.SATURDAY.ordinal());

      // The following statement compares two enum constants.
      if (Day.FRIDAY.compareTo(Day.MONDAY) > 0)
         System.out.println(Day.FRIDAY + " is greater than " +
                            Day.MONDAY);
      else
         System.out.println(Day.FRIDAY + " is NOT greater than " +
                            Day.MONDAY);
   }
}