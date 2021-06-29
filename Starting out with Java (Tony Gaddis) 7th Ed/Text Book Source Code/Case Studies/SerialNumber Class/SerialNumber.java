/**
   The SerialNumber class takes a software serial number in
   the form of LLLLL-DDDD-LLLL where each L is a letter
   and each D is a digit. The serial number has three groups
   of characters, separated by hyphens. The class extracts
   the three groups of characters and validates them.
*/

public class SerialNumber
{
   private String first;   // First group of characters
   private String second;  // Second group of characters
   private String third;   // Third group of characters
   private boolean valid;  // Flag indicating validity

   /**
      The constructor breaks a serial number into
      three groups and each group is validated.
      @param sn A serial number.
   */

   public SerialNumber(String sn)
   {
      // Trim the argument.
      sn = sn.trim();
      
      // Tokenize the argument.
      String tokens[] = sn.split("-");

      // Validate the tokens.
      if (tokens.length != 3)
         valid = false;
      else
      {
         first = tokens[0];
         second = tokens[1];
         third = tokens[2];
         validate();
      }

   }

   /**
      The isValid method returns a boolean value
      indicating whether the serial number is valid.
      @return true if the serial number is valid,
              otherwise false.
   */

   public boolean isValid()
   {
       return valid;
   }

   /**
      The validate method sets the valid field to true
      if the serial number is valid. Otherwise it sets
      valid to false.
   */

   private void validate()
   {
      if (isFirstGroupValid() && isSecondGroupValid() && 
          isThirdGroupValid())
         valid = true;
      else
         valid = false;
   }

   /**
      The isFirstGroupValid method validates the first
      group of characters. 
      @return true if the group is valid, otherwise false.
   */

   private boolean isFirstGroupValid()
   {
      boolean groupGood = true;  // Flag
      int i = 0;                 // Loop control variable

      // Check the length of the group.
      if (first.length() != 5)
         groupGood = false;

      // See if each character is a letter.
      while (groupGood && i < first.length())
      {
         if (!Character.isLetter(first.charAt(i)))
            groupGood = false;
         i++;
      }

      return groupGood;
   }

   /**
      The isSecondGroupValid method validates the second
      group of characters. 
      @return true if the group is valid, otherwise false.
   */


   private boolean isSecondGroupValid()
   {
      boolean groupGood = true;  // Flag
      int i = 0;                 // Loop control variable

      // Check the length of the group.
      if (second.length() != 4)
         groupGood = false;

      // See if each character is a digit.
      while (groupGood && i < second.length())
      {
         if (!Character.isDigit(second.charAt(i)))
            groupGood = false;
         i++;
      }

      return groupGood;
   }

   /**
      The isThirdGroupValid method validates the third
      group of characters. 
      @return true if the group is valid, otherwise false.
   */


   private boolean isThirdGroupValid()
   {
      boolean groupGood = true;  // Flag
      int i = 0;                 // Loop control variable

      // Check the length of the group.
      if (third.length() != 4)
         groupGood = false;

      // See if each character is a letter.
      while (groupGood && i < third.length())
      {
         if (!Character.isLetter(third.charAt(i)))
            groupGood = false;
         i++;
      }

      return groupGood;
   }
}

