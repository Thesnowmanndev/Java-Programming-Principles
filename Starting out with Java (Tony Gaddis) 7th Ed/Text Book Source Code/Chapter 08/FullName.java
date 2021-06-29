/**
   This class stores a person's first, last, and middle
   names. The class is dangerous because it does not
   prevent operations on null reference fields.
*/

public class FullName
{
   private String lastName;   // Last name
   private String firstName;  // First name
   private String middleName; // Middle name

   /**
      The setLastName method sets the lastName field.
      @param str The String to set lastName to.
   */

   public void setLastName(String str)
   {
      lastName = str;
   }

   /**
      The setFirstName method sets the firstName field.
      @param str The String to set firstName to.
   */

   public void setFirstName(String str)
   {
      firstName = str;
   }

   /**
      The setMiddleName method sets the middleName field.
      @param str The String to set middleName to.
   */

   public void setMiddleName(String str)
   {
      middleName = str;
   }

   /**
      The getLength method returns the length of the
      full name. 
      @return The length.
   */

   public int getLength()
   {
      return lastName.length() + firstName.length()
             + middleName.length();
   }

   /**
      The toString method returns the full name.
      @return A reference to a String.
   */

   public String toString()
   {
      return firstName + " " + middleName + " "
             + lastName;
   }
}
