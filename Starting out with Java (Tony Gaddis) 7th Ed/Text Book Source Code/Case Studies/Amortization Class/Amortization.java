import java.io.*;                // For file-related classes

/**
   This class stores loan information and creates a
   text file containing an amortization report.
*/

public class Amortization
{
   private double loanAmount;   // Loan Amount
   private double interestRate; // Annual Interest Rate
   private double loanBalance;  // Monthly Balance
   private double term;         // Payment Term
   private double payment;      // Monthly Payment
   private int    loanYears;    // Years of Loan

   /**
      The constructor accepts the loan amount, the annual 
      interest rate, and the number of years of the loan
      as arguments. The private method CalcPayment is then
      called.
      @param loan The loan amount.
      @param rate The annual interest rate.
      @param years The number of years of the loan.
   */

   public Amortization(double loan, double rate, int years)
   {
      loanAmount = loan;
      loanBalance = loan;
      interestRate = rate;
      loanYears = years;
      calcPayment();
   }

   /**
      The calcPayment method calculates the monthly payment
      amount. The result is stored in the payment field.
   */

   private void calcPayment()
   {
      // Calculate value of Term
      term = 
        Math.pow((1+interestRate/12.0), 12.0 * loanYears);

      // Calculate monthly payment
      payment = 
        (loanAmount * interestRate/12.0 * term) / (term - 1);
   }

   /**
      The getNumberOfPayments method returns the total number of
      payments to be made for the loan.
      @return The number of loan payments.
   */

   public int getNumberOfPayments()
   {
      return 12 * loanYears;
   }

   /**
      The saveReport method saves the amortization report to
      the file named by the argument.
      @param filename The name of the file to create.
   */

   public void saveReport(String filename) throws IOException
   {
      double monthlyInterest;  // The monthly interest rate
      double principal;        // The amount of principal
      //DecimalFormat dollar = new DecimalFormat("#,##0.00");
      FileWriter fwriter = new FileWriter(filename);
      PrintWriter outputFile = new PrintWriter(fwriter);

      // Print monthly payment amount.
      outputFile.println(String.format(
               "Monthly Payment: $%.2f", payment));

      // Print the report header.
      outputFile.println("Month\tInterest\tPrincipal\tBalance");
      outputFile.println("-----------------------------------" +
                         "--------------");

      // Display the amortization table.
      for (int month = 1; month <= getNumberOfPayments(); month++)
      {
         // Calculate monthly interest.
         monthlyInterest = interestRate / 12.0 * loanBalance;

         if (month != getNumberOfPayments())
         {
            // Calculate payment applied to principal
            principal = payment - monthlyInterest;
         }
         else    // This is the last month.
         {
            principal = loanBalance;
            payment = loanBalance + monthlyInterest;
         }

         // Calculate the new loan balance.
         loanBalance -= principal;

         // Display a line of data.
         outputFile.println(String.format("%d\t%.2f\t\t%.2f\t\t%.2f",
                            month, monthlyInterest, principal,
                            loanBalance));
      }

      // Close the file.
      outputFile.close();
   }

   /**
      The getLoanAmount method returns the loan amount.
      @return The value in the loanAmount field.
   */

   public double getLoanAmount()
   {
      return loanAmount;
   }

   /**
      The getInterestRate method returns the interest rate.
      @return The value in the interestRate field.
   */

   public double getInterestRate()
   {
      return interestRate;
   }

   /**
      The getLoanYears method returns the years of the loan.
      @return The value in the loanYears field.
   */

   public int getLoanYears()
   {
      return loanYears;
   }
}
