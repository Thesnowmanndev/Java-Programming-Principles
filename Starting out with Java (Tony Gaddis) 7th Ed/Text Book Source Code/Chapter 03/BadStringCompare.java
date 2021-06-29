/**
   This program incorrectly uses the == operator to compare
   two String objects. The comparison does not work.
*/

public class BadStringCompare
{
   public static void main(String [] args)
   {
      String name1 = "Mark",
             name2 = "Mark";

      if (name1 == name2)  // ERROR!
      {
         System.out.println(name1 + " and " + name2 +
                            " are the same.");
      }
      else
      {
         System.out.println(name1 + " and " + name2 +
                            " are the NOT the same.");
      }
   }
}
