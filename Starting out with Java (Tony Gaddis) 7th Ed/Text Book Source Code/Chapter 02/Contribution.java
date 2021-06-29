// This program calculates the amount of pay that
// will be contributed to a retirement plan if 5%,
// 8%, or 10 % of monthly pay is withheld.

public class Contribution
{
   public static void main(String[] args)
   {
      // Variables to hold the monthly pay and
      // the amount of contribution.
      double monthlyPay = 6000.0;
      double contribution;
      
      // Calculate and display a 5% contribution.
      contribution = monthlyPay * 0.05;
      System.out.println("5 percent is $" +
                         contribution +
                         " per month.");

      // Calculate and display a 8% contribution.
      contribution = monthlyPay * 0.08;
      System.out.println("8 percent is $" +
                         contribution +
                         " per month.");

      // Calculate and display a 10% contribution.
      contribution = monthlyPay * 0.1;
      System.out.println("10 percent is $" +
                         contribution +
                         " per month.");
   }
}