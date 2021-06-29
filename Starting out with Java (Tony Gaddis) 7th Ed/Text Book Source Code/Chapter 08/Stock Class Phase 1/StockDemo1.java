/**
   This program demonstrates the Stock class's
   toString method.
*/

public class StockDemo1
{
   public static void main(String[] args)
   {
      // Create a Stock object for the XYZ Company.
      // The trading symbol is XYZ and the current
      // price per share is $9.62.
      Stock xyzCompany = new Stock ("XYZ", 9.62);
      
      // Display the object's values.
      System.out.println(xyzCompany);
   }
}