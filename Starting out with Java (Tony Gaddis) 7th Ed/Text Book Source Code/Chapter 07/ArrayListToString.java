import java.util.ArrayList;   // Needed for ArrayList class

/**
   This program demonstrates the ArrayList toString method.
*/

public class ArrayListToString
{
   public static void main(String[] args)
   {
      // Create a vector to hold some names.
      ArrayList<String> nameList = new ArrayList<String>();
      
      // Add some names to the ArrayList.
      nameList.add("James");
      nameList.add("Catherine");
      nameList.add("Bill");
      
      // Now display the items in nameList.
      System.out.println(nameList);
   }
}