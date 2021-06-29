/**
   The Telephone class provides static methods
   for formatting and unformatting US telephone
   numbers.
*/
 
public class Telephone
{
   // These constant fields hold the valid lengths of
   // strings that are formatted and unformatted.
   public final static int FORMATTED_LENGTH = 13;
   public final static int UNFORMATTED_LENGTH = 10;
   
   /**
      The isFormatted method determines whether a
      string is properly formatted as a US telephone
      number in the following manner:
      (XXX)XXX-XXXX
      @param str The string to test.
      @return true if the string is properly formatted,
              or false otherwise.
   */

   public static boolean isFormatted(String str)
   {
      boolean valid;  // Flag to indicate valid format
      
      // Determine whether str is properly formatted.
      if (str.length() == FORMATTED_LENGTH && 
          str.charAt(0) == '(' &&
          str.charAt(4) == ')' &&
          str.charAt(8) == '-')
          valid = true;
      else
         valid = false;
      
      // Return the value of the valid flag.
      return valid;
   }
   
   /**
      The unformat method accepts a string containing
      a telephone number formatted as:
      (XXX)XXX-XXXX.
      If the argument is formatted in this way, the
      method returns an unformatted string where the
      parentheses and hyphen have been removed. Otherwise,
      it returns the original argument.
      @param str The string to unformat.
      @return An unformatted string.
   */
    
   public static String unformat(String str)
   {
      // Create a StringBuilder initialized with str.
      StringBuilder strb = new StringBuilder(str);
      
      // If the argument is properly formatted, then
      // unformat it.
      if (isFormatted(str))
      {
         // First, delete the left paren at position 0.
         strb.deleteCharAt(0);
         
         // Next, delete the right paren. Because of the
         // previous deletion it is now located at
         // position 3.
         strb.deleteCharAt(3);
         
         // Next, delete the hyphen. Because of the
         // previous deletions it is now located at
         // position 6.
         strb.deleteCharAt(6);
      }
      
      // Return the unformatted string.
      return strb.toString();
   }
   
   /**
      The format method formats a string as: 
      (XXX)XXX-XXXX.
      If the length of the argument is UNFORMATTED_LENGTH
      the method returns the formatted string. Otherwise,
      it returns the original argument.
      @param str The string to format.
      @return A string formatted as a US telephone number.
   */
    
   public static String format(String str)
   {
      // Create a StringBuilder initialized with str.
      StringBuilder strb = new StringBuilder(str);
      
      // If the argument is the correct length, then
      // format it.
      if (str.length() == UNFORMATTED_LENGTH)
      {
         // First, insert the left paren at position 0.
         strb.insert(0, "(");
            
         // Next, insert the right paren at position 4. 
         strb.insert(4, ")");
            
         // Next, insert the hyphen at position 8.
         strb.insert(8, "-");
      }
      
      // Return the formatted string.
      return strb.toString();
   }
}