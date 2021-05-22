/*
* This program was written by Kyle Martin on 5/18/2021 for CPT421 Java Programming Principles 1 during Summer Session 1
* at Southwestern College, Kansas.
*
* IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
* have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
* explain my code.
*
* This app is written to help its users calculate and display sales tax and a grand total of the item they are
* purchasing.
* */

import java.util.Scanner;

public class salesTax {
    public static void main(String[] args) {
        // Declarations
        float itemRetailPrice;
        float salesTaxRate;

        // Create a scanner to scan for user input
        Scanner appScanner = new Scanner(System.in);

        // Ask retail price and store as a variable
        System.out.println("What is the retail price of the item being purchased? Example: 17 if the item costs $17.");
        itemRetailPrice = appScanner.nextFloat();

        // Ask sales tax rate and store as a variable
        System.out.println("What is your sales tax rate? Example: 5 if your tax rate is 5%.");
        salesTaxRate = appScanner.nextFloat();

        // Perform calculations and round
        float salesTax = itemRetailPrice * (salesTaxRate / 100);
        float grandTotal = itemRetailPrice + salesTax;
        float roundedSalesTax = (float) (Math.round(salesTax * 100) / 100.0);
        float roundedGrandTotal = (float) (Math.round(grandTotal * 100) / 100.0);

        // Convert numbers to a string
        String st = String.valueOf(roundedSalesTax);
        String gt = String.valueOf(roundedGrandTotal);

        // Display final messages to the user
        System.out.println("Your sales tax comes to $" + st + ".");
        System.out.println("Your grand total comes to $" + gt + ".");
    }
}
