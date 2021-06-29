/**
   This program passes an object as an argument.
   The object is modified by the receiving method.
*/

public class PassObject2
{
   public static void main(String[] args)
   {
      // Create a Rectangle object.
      Rectangle box = new Rectangle(12.0, 5.0);

      // Display the object's contents.
      System.out.println("Contents of the box object:");
      System.out.println("Length : " + box.getLength() +
                         " Width : " + box.getWidth());

      // Pass a reference to the object to the
      // changeRectangle method.
      changeRectangle(box);

      // Display the object's contents again.
      System.out.println("\nNow the contents of the " +
                         "box object are:");
      System.out.println("Length : " + box.getLength() +
                         " Width : " + box.getWidth());
   }

   /**
      The changeRectangle method sets a Rectangle
      object's length and width to 0.
      @param r The Rectangle object to change.
   */

   public static void changeRectangle(Rectangle r)
   {
      r.setLength(0.0);
      r.setWidth(0.0);
   }
}
