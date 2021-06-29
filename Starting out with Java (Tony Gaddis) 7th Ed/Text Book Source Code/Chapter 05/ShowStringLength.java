/**
   This program demonstrates a method that accepts a String
   object as an argument.
*/

public class ShowStringLength
{
   public static void main(String[] args)
   {
      String name = "Warren";
      showLength(name);
   }
   
   /**
      The showLength method accepts a String as its argument
      and displays the number of characters in the String.
   */
   
   public static void showLength(String str)
   {
        System.out.println(str + " is " + str.length() +
                           " characters long.");
   }
}
