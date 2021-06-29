/**
   This program demonstrates hierarchical method calls.
*/

public class DeepAndDeeper
{
   public static void main(String[] args)
   {
      System.out.println("I am starting in main.");
      deep();
      System.out.println("Now I am back in main.");   
   }
   
   /**
      The deep method displays a message and then calls
      the deeper method.
   */
   
   public static void deep()
   {
      System.out.println("I am now in deep.");
      deeper();
      System.out.println("Now I am back in deep.");
   }

   /**
      The deeper method simply displays a message.
   */
   
   public static void deeper()
   {
      System.out.println("I am now in deeper.");
   }
}
