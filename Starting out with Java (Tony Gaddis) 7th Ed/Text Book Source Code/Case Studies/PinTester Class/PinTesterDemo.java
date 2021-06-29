/**
   This program tests the PinTester class with
   various PIN values.
*/

public class PinTesterDemo
{
   public static void main(String[] args)
   {
      // Create two sample arrays that are identical.
      int [] pin1 = {2, 4, 1, 8, 7, 9, 0};
      int [] pin2 = {2, 4, 1, 8, 7, 9, 0};
      
      // Create two sample arrays that are different.
      int [] pin3 = {2, 4, 6, 8, 7, 9, 0};
      int [] pin4 = {1, 2, 3, 4, 5, 6, 7};
      
      // Create two PinTester objects.
      PinTester pt1 = new PinTester(pin1, pin2);
      PinTester pt2 = new PinTester(pin3, pin4);

      // Compare pin1 and pin2. These arrays are identical.
      if (pt1.isValid())
      {
         System.out.println("SUCCESS: pin1 and pin2 " +
                            "are the same.");
      }
      else
      {
         System.out.println("ERROR: pin1 and pin2 " +
                            "are different.");
       }

      // Compare pin3 and pin4. All of the elements in these 
      // arrays are different.

      if (pt2.isValid())
      {
         System.out.println("ERROR: pin3 and pin4 " +
                            "are the same.");
      }
      else
      {
         System.out.println("SUCCESS: pin3 and pin4 " +
                            "are different.");
      }
   }
}
