/**
   This program demonstrates a method that
   returns a reference to a String object.
*/

public class ReturnString
{
   public static void main(String[] args)
   {
      String customerName;
      
      customerName = fullName("John", "Martin");
      System.out.println(customerName);
   }
   
   /**
      The fullName method accepts two String arguments
      containing a first and last name. It concatenates
      them into a single String object.
      @param first The first name.
      @param last The last name.
      @return A reference to a String object containing
              the first and last names.
   */
   
   public static String fullName(String first, String last)
   {
      String name;
      
      name = first + " " + last;
      return name;
   }
}
