/*
 * This program was written by Kyle Martin on 6/12/2021 for CPT421 Java Programming Principles 1 during Summer Session 1
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was created to display the current needed amount of money in a savings account in order to reach a goal
 * amount based on the length of time willing to wait and the annual percentage yield of the savings account.
 * See Chapter 5 Programming Challenge 16 Present Value.
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class PresentValue {
    private static final Scanner keyboard = new Scanner(System.in);
    private static final DecimalFormat format = new DecimalFormat("#,###.##");
    private static final DecimalFormat noDecimal = new DecimalFormat("#,###");

    private static double presentValue(double futureValue, double annualPercentageYield, double numberOfYears) {
        annualPercentageYield = annualPercentageYield / 100;
        return futureValue / Math.pow((1 + annualPercentageYield), numberOfYears);
    }

    public static void main(String[] args) {
        int tenThousand = 10000;
        double annualPercentageYield;
        double futureValue;
        double numberOfYears;

        System.out.println("What is the desired amount of money you would like in your account? Ex. 10000 for $"
                            + format.format(tenThousand));
        futureValue = keyboard.nextDouble();

        System.out.println("What is the annual percentage yield of your savings account? Ex. 2.25 for 2.25%");
        annualPercentageYield = keyboard.nextDouble();

        System.out.println("What is the number of years you would like to wait? Ex. 10 for 10 years.");
        numberOfYears = keyboard.nextDouble();

        double presentValue = presentValue(futureValue, annualPercentageYield, numberOfYears);

        System.out.println( "You currently need $" + format.format(presentValue) + " in your account to reach the goal "
                            + "of $" + format.format(futureValue) + " while waiting " + noDecimal.format(numberOfYears)
                            + " years with the annual percentage yield of " + format.format(annualPercentageYield)
                            + "%.");
    }
}
