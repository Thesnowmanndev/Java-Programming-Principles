/**
	This program demonstrates the String class's
	split method. Multi-character delimiters are used.
*/

public class SplitDemo2
{
   public static void main(String[] args)
   {
      // Create a string to tokenize.
      String str = "one and two and three and four";
      
      // Get the tokens, using " and " as the delimiter.
      String[] tokens = str.split(" and ");
      
      // Display the tokens.
      for (String s : tokens)
         System.out.println(s);
   }
}