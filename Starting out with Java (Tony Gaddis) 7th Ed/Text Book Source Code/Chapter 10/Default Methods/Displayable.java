public interface Displayable
{
   default void display()
   {
      System.out.println("This is the default display method.");
   }
}