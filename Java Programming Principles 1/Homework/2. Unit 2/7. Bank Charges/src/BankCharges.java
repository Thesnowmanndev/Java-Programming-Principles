/*
 * This program was written by Kyle Martin on 5/27/2021 for CPT421 Java Programming Principles 1 during Summer Session 1
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program calculates the total service fee based on the amount of checks written in a month.
 */
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class BankCharges {
    public static void main(String[] args) {
        // Scanner
        Scanner userInput = new Scanner(System.in);
        NumberFormat moneyFormat = new DecimalFormat("#,###.##");
        
        // Declarations
        final double MONTHLY_BASE_CHARGE = 10.00;
        final double LESS_THAN_TWENTY_CHECKS = 0.10;
        final double TWENTY_TO_THIRTY_NINE_CHECKS = 0.08;
        final double FORTY_TO_FIFTY_NINE_CHECKS = 0.06;
        final double SIXTY_PLUS_CHECKS = 0.04;
        
        double totalMonthlyServiceFee = 0;

        // Questionnaire
        System.out.println("Welcome the the Bank Service Fee inquiry system.");
        System.out.println( "The Bank charges a flat rate fee of $" + moneyFormat.format(MONTHLY_BASE_CHARGE) +
                            " per month.");
        System.out.println( "The Bank also charges a fee of: \n" +
                            "$" + LESS_THAN_TWENTY_CHECKS + " each check for less than 20 checks a month written \n" +
                            "$" + TWENTY_TO_THIRTY_NINE_CHECKS + " each check for 20-39 checks a month written \n" +
                            "$" + FORTY_TO_FIFTY_NINE_CHECKS + " each check for 40-59 checks a month written \n" +
                            "$" + SIXTY_PLUS_CHECKS + " each check for 60+ checks a month written");
        System.out.println("How many checks did you write this month? Ex. 10 for 10 checks");
        int checksWritten = userInput.nextInt();
        
        // Calculations
        if (checksWritten >= 60) {
            totalMonthlyServiceFee = MONTHLY_BASE_CHARGE + (SIXTY_PLUS_CHECKS * checksWritten);
        } else if (checksWritten <= 59 && checksWritten >= 40) {
            totalMonthlyServiceFee = MONTHLY_BASE_CHARGE + (FORTY_TO_FIFTY_NINE_CHECKS * checksWritten);
        } else if  (checksWritten <= 39 && checksWritten >= 20) {
            totalMonthlyServiceFee = MONTHLY_BASE_CHARGE + (TWENTY_TO_THIRTY_NINE_CHECKS * checksWritten);
        } else if (checksWritten < 20 && checksWritten >= 1) {
            totalMonthlyServiceFee = MONTHLY_BASE_CHARGE + (LESS_THAN_TWENTY_CHECKS * checksWritten);
        } else {
            System.out.println("Please enter a correct solid number of checks.");
        }
        System.out.println( "You wrote " + checksWritten + " this month. Your charge comes to $" + 
                            moneyFormat.format(totalMonthlyServiceFee));
    }
}
