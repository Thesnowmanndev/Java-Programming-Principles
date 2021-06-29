/** 
   This program asks the user to enter his or her
   first, middle, and last names.
*/

import java.io.*;

public class ReadKeyboard
{
   public static void main(String[] args) throws IOException
   {
      String firstName,    // The user's first name
             middleName,   // The user's middle name
             lastName;     // The user's last name
      
      // Create the necessary objects to read keyboard input.
      InputStreamReader reader = 
                     new InputStreamReader(System.in);
      BufferedReader keyboard = 
                     new BufferedReader(reader);
      
      // Ask the user to enter his or her first name.
      System.out.print("Enter your first name: ");
      firstName = keyboard.readLine();
      
      // Ask the user to enter his or her middle name.
      System.out.print("Enter your middle name: ");
      middleName = keyboard.readLine();

      // Ask the user to enter his or her last name.
      System.out.print("Enter your last name: ");
      lastName = keyboard.readLine();

      // Display a greeting.
      System.out.println("Hello " + firstName + " " +
                         middleName + " " + lastName);
   }
}
