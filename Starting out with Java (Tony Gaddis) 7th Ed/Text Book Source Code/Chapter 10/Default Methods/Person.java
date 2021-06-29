/**
   This class implements the Displayable
   interface, but does not override the
   default display method.
*/

public class Person implements Displayable
{
   private String name;
   
   // Constructor
   public Person(String n)
   {
      name = n;
   }
}
