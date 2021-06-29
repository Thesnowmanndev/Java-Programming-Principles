/**
   This program demonstrates that String arguments
   cannot be changed.
*/

public class PassString
{
   public static void main(String[] args)
   {
      // Create a String object containing "Shakespeare".
      // The name variable references the object.
      String name = "Shakespeare";
      
      // Display the String referenced by the name variable.
      System.out.println("In main, the name is " +
                         name);
      
      // Call the changeName method, passing the
      // contents of the name variable as an argument.
      changeName(name);
      
      // Display the String referenced by the name variable.
      System.out.println("Back in main, the name is " +
                         name);
   }
   
   /**
      The changeName method accepts a String as its argument
      and assigns the str parameter to a new String.
   */
   
   public static void changeName(String str)
   {
      // Create a String object containing "Dickens".
      // Assign its address to the str parameter variable.
      str = "Dickens";
      
      // Display the String referenced by str.
      System.out.println("In changeName, the name " +
                         "is now " + str);
   }
}
