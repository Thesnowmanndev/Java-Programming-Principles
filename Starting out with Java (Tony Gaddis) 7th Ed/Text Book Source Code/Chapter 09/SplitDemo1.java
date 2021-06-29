/**
   This program demonstrates the String class's
   split method.
*/

public class SplitDemo1
{
   public static void main(String[] args)
   {
      // Create a string to tokenize.
      String str = "one two three four";
      
      // Get the tokens, using a space delimiter.
      String[] tokens = str.split(" ");
      
      // Display the tokens.
      for (String s : tokens)
         System.out.println(s);
   }
}