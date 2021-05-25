/*
* This program was written by Kyle Martin on 5/18/2021 for CPT421 Java Programming Principles 1 during Summer Session 1
* at Southwestern College, Kansas.
*
* IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
* have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
* explain my code.
*
* This app is written to help its users calculate the available credit they have left.
 */

import java.util.Scanner;

public class availableCredit {
    public static void main(String[] args) {
        // Declarations
        float maximumCredit;
        float creditUtilized;
        float creditAvailable;

        // Create a scanner to scan for user input
        Scanner appScanner = new Scanner(System.in);

        // Ask maximum credit and store as a variable / convert to a string
        System.out.println("What is your maximum amount of credit? Example: $500.00");
        maximumCredit = appScanner.nextFloat();
        String mc = String.valueOf(maximumCredit);

        // Ask credit utilized and store as a variable / convert to a string
        System.out.println("What is the amount of credit you have utilized? Example: $225.25");
        creditUtilized = appScanner.nextFloat();
        String cu =  String.valueOf(creditUtilized);

        // Perform calculations and round
        creditAvailable =  maximumCredit - creditUtilized;
        String ca = String.valueOf(creditAvailable);
        float rounded = (float) (Math.round(creditAvailable * 1000) / 1000.0);
        String cr = String.valueOf(rounded);

        // Display final message to the user
        System.out.println("$" + mc + " - " + "$" + cu + " = " + "$" + ca + "." + " You have " + "$" + cr +
                " of your maximum credit available.");
    }
}
