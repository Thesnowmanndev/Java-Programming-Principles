/**
	This program demonstrates a method that accepts
	a variable number of arguments (varargs).
*/

public class VarargsDemo4
{
   public static void main(String[] args)
   {
      int result;  // To hold a result
		
		// Create an array of ints.
		int[] values = { 10, 20, 30, 40, 50 };
      
      // Call the method with two arguments.
      result = sum(10, 20);
      System.out.println(result);
      
      // Call the method with four arguments.
      result = sum(10, 20, 30, 40);
      System.out.println(result);

      // Call the method passing the array.
      result = sum(values);
      System.out.println(result);
   }
   
   /**
   	The sum method takes a variable number of int
   	arguments and returns their sum.
		@param numbers A set of numbers.
		@return The sum of the numbers.
   */
   
   public static int sum(int... numbers)
   {
      int total = 0;  // Accumulator
      
      // Add all the values in the numbers array.
      for (int val : numbers)
         total += val;
      
      // Return the total.
      return total;
   }
}