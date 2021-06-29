import java.text.DecimalFormat;
import java.util.Scanner;

public class CompoundInterest {
/*
    When a bank account pays compound interest, it pays interest not only on the principal amount that was deposited
    into the account, but also on the interest that has accumulated over time. Suppose you want to deposit some money
    into a savings account, and let the account earn compound interest for a certain number of years. The formula for
    calculating the balance of the account after a specified number of years is:

    A=P(1+rn)nt

    The terms in the formula are:

    A is the amount of money in the account after the specified number of years.
    P is the principal amount that was originally deposited into the account.
    r is the annual interest rate.
    n is the number of times per year that the interest is compounded.
    t is the specified number of years.

    Write a program that makes the calculation for you. The program should ask the user to input the following:

    - The amount of principal originally deposited into the account
    - The annual interest rate paid by the account
    - The number of times per year that the interest is compounded
        (For example, if interest is compounded monthly, enter 12. If interest is compounded quarterly, enter 4.)
    - The number of years the account will be left to earn interest

    Once the input data has been entered, the program should calculate and display the amount of money that will be in
    the account after the specified number of years.

    Note: The user should enter the interest rate as a percentage. For example, 2 percent would be entered as 2,
    not as .02. The program will then have to divide the input by 100 to move the decimal point to the correct position.
*/
    private double principalAmount;
    private double annualInterestRate;
    private double numberOfCompoundedTimes;
    private double numberOfYears;

    private static final Scanner input = new Scanner(System.in);
    private static final DecimalFormat format = new DecimalFormat("#,###.##");

    public double calculateCompoundInterest() {
        double A;
        double P = getPrincipalAmount();
        double r = getAnnualInterestRate() / 100;
        double n = getNumberOfCompoundedTimes();
        double t = getNumberOfYears();

        A = P * (1 + r * n) * n * t;

        return A;
    }

    public double getNumberOfYears() {
        return numberOfYears;
    }

    public double getNumberOfCompoundedTimes() {
        return numberOfCompoundedTimes;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public double getPrincipalAmount() {
        return principalAmount;
    }

    public void setPrincipalAmount(double inputPrincipalAmount) {
        principalAmount = inputPrincipalAmount;
    }

    public void setAnnualInterestRate(double inputAnnualInterestRate) {
        annualInterestRate = inputAnnualInterestRate;
    }

    public void setNumberOfCompoundedTimes(double inputNumberOfCTimes) {
        numberOfCompoundedTimes = inputNumberOfCTimes;
    }

    public void setNumberOfYears(double inputNumberOfYears) {
        numberOfYears = inputNumberOfYears;
    }

    public static void main(String[] args) {
        CompoundInterest compoundInterest = new CompoundInterest();

        System.out.println( "Input the amount of principal originally deposited into the account. Ex. 10000");
        compoundInterest.setPrincipalAmount(input.nextDouble());

        System.out.println( "Input the annual interest rate paid by the account. Ex. 2 for 2%");
        compoundInterest.setAnnualInterestRate(input.nextDouble());

        System.out.println( "Input the number of times per year that the interest is compounded. Monthly = 12. " +
                            "Quarterly = 4.");
        compoundInterest.setNumberOfCompoundedTimes(input.nextDouble());

        System.out.println( "Input the number of years the account will be left to earn interest. Ex. 35 for 35 years");
        compoundInterest.setNumberOfYears(input.nextDouble());

        double estimatedAmount = compoundInterest.calculateCompoundInterest();

        System.out.println( "In " + compoundInterest.getNumberOfYears() + " years you will have a estimated " +
                            "account balance of $" + format.format(estimatedAmount) + ".");
    }
}
