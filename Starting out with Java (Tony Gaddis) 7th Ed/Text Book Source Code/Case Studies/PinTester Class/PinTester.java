/**
   The PinTester class is used to compare the PIN that
   was entered by a user to the valid PIN.
*/

public class PinTester
{
   private int[] userPIN;  // The PIN entered
   private int[] validPIN; // The valid PIN
   
   /**
      Constructor 
      @param user The PIN digits entered by the user.
      @param valid The valid PIN digits.
   */
   
   PinTester(int[] user, int[] valid)
   {
      // Create an array to hold a copy of the
      // PIN digits entered by the user.
      userPIN = new int[user.length];
      
      // Copy the user array to the userPIN array.
      for (int i = 0; i < user.length; i++)
         userPIN[i] = user[i];

      // Create an array to hold a copy of the
      // valid PIN digits.
      validPIN = new int[valid.length];

      // Copy the valid array to the validPIN array.
      for (int i = 0; i < valid.length; i++)
         validPIN[i] = valid[i];
   }
   
   /**
      The isValid method compares the PIN digits entered
      by the user and determines whether they are valid.
      @return true if valid, false otherwise.
   */

   public boolean isValid()
   {
      int i;            // Loop control variable
      boolean isEqual;  // Flag 

      // Compare the lengths of the two arrays. If 
      // the arrays are not the same size, then they
      // are not equal.

      if (userPIN.length != validPIN.length)
         isEqual = false;
      else   // Compare the contents of the two arrays
      {
         i = 0;
         isEqual = true;

         while (isEqual && i < userPIN.length)
         {
            if (userPIN[i] != validPIN[i])
               isEqual = false;
            i++;
         }
      }

      return isEqual;
   }
}
