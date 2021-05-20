/*
 * This program was written by Kyle Martin on 5/20/2021 for CPT421 Java Programming Principles 1 during Summer Session 1
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This app is written to help its users calculate the available balance of their bank account
 */

import java.util.Scanner;

public class accountBalance {
    public static void main(String[] args) {
        // Declarations
        float startingBalance, totalDeposits, totalWithdrawals, monthlyInterest, amountBeforeInterest,
                amountAfterInterest, grandTotal;

        // Scanner
        Scanner appScanner = new Scanner(System.in);

        // Asks for Starting Balance
        System.out.println("What was the starting balance of your bank account this month in dollars? " +
                "Example: 500.79 for $500.79.");
        startingBalance = appScanner.nextFloat();

        // Asks for the total deposits made
        System.out.println("What was the total dollar amount of deposits made into the bank account? " +
                "Example: 1759.39 for $1759.39.");
        totalDeposits = appScanner.nextFloat();

        // Asks for the total withdrawals they made
        System.out.println("What was the total dollar amount of withdrawals made in the bank account? " +
                "Example: 439.49 for $439.49.");
        totalWithdrawals = appScanner.nextFloat();

        // Asks monthly interest rate
        System.out.println("What is your monthly interest rate for your bank account? " +
                "Example: 0.02 for 2% or 0.5 for 50%.");
        monthlyInterest = appScanner.nextFloat();

        // Calculations
        amountBeforeInterest = (startingBalance + totalDeposits) - totalWithdrawals;
        amountAfterInterest = amountBeforeInterest * monthlyInterest;
        grandTotal = amountBeforeInterest + amountAfterInterest;
        float rounded = (float) (Math.round(grandTotal * 100) / 100.0);

        // Displays balance to the user
        System.out.println("Your grand total comes to: $" + rounded);
    }
}
