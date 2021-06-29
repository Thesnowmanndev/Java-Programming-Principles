import java.util.Scanner;

/**
   This program uses the startsWith method to search using
   a partial string.
*/

public class PersonSearch
{
   public static void main(String[] args)
   {
      String lookUp;  // To hold a lookup string
      
      // Create an array of names.
      String[] people = { "Cutshaw, Will", "Davis, George",
                          "Davis, Jenny", "Russert, Phil",
                          "Russell, Cindy", "Setzer, Charles",
                          "Smathers, Holly", "Smith, Chris",
                          "Smith, Brad", "Williams, Jean" };

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get a partial name to search for.
      System.out.print("Enter the first few characters of " +
                       "the last name to look up: ");
      lookUp = keyboard.nextLine();

      // Display all of the names that begin with the 
      // string entered by the user.
      System.out.println("Here are the names that match:");
      for (String person : people)
      {
         if (person.startsWith(lookUp))
            System.out.println(person);
      }
   }
}
