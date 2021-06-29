/**
	This program demonstrates the String class's
	split method. Several different delimiters are used.
*/

public class SplitDemo3
{
   public static void main(String[] args)
   {
      // Create a string to tokenize.
      String str = "joe@gaddisbooks.com";
      
      // Get the tokens, using @ and . as delimiters.
      String[] tokens = str.split("[@.]");
      
      // Display the tokens.
      for (String s : tokens)
         System.out.println(s);   
   }
}