/**
   This program demonstrates the Rectangle class's
   setLength method.
*/

public class LengthDemo
{
   public static void main(String[] args)
   {
      // Create a Rectangle object and assign its
      // address to the box variable.
      Rectangle box = new Rectangle();

      // Indicate what we are doing.
      System.out.println("Sending the value 10.0 " +
                         "to the setLength method.");
      
      // Call the box object's setLength method.
      box.setLength(10.0);
      
      // Indicate we are done.
      System.out.println("Done.");
   }
}
