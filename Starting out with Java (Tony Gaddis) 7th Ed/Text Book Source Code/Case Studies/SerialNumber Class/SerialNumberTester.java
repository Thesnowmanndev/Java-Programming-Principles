/**
   This program demonstrates the SerialNumber class.
*/

public class SerialNumberTester
{
   public static void main(String[] args)
   {
      String serial1 = "GHTRJ-8975-AQWR"; // Valid
      String serial2 = "GHT7J-8975-AQWR"; // Invalid
      String serial3 = "GHTRJ-8J75-AQWR"; // Invalid
      String serial4 = "GHTRJ-8975-AQ2R"; // Invalid

      // Validate serial1.

      SerialNumber sn = new SerialNumber(serial1);
      if (sn.isValid())
         System.out.println(serial1 + " is valid.");
      else
         System.out.println(serial1 + " is invalid.");

      // Validate serial2.

      sn = new SerialNumber(serial2);
      if (sn.isValid())
         System.out.println(serial2 + " is valid.");
      else
         System.out.println(serial2 + " is invalid.");

      // Validate serial3.

      sn = new SerialNumber(serial3);
      if (sn.isValid())
         System.out.println(serial3 + " is valid.");
      else
         System.out.println(serial3 + " is invalid.");

      // Validate serial4.

      sn = new SerialNumber(serial4);
      if (sn.isValid())
         System.out.println(serial4 + " is valid.");
      else
         System.out.println(serial4 + " is invalid.");
   }
}
