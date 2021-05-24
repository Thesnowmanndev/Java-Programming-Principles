/*
 * Book: Starting Out with Java, 7th Edition by Tony Gaddis
 * Program Author: Kyle Martin | https://github.com/thesnowmanndev
 * This program was created to calculate the state tax, county tax, and total amount of a item being purchased.
 * */

import java.text.DecimalFormat;
import java.util.Scanner;

public class SalesTax {
    public static void main(String[] args) {
        double stateTax = 0.04, countyTax = 0.02, retailPrice, stateTaxAmount, countyTaxAmount, totalCost;
        Scanner userInput = new Scanner(System.in);
        DecimalFormat chosenFormat = new DecimalFormat("#,###.##");

        System.out.println( "How much was the retail price of the item being purchased? " +
                            "Example: 57.99 for $57.99");
        retailPrice = userInput.nextDouble();
        stateTaxAmount = retailPrice * stateTax;
        countyTaxAmount = retailPrice * countyTax;
        totalCost = stateTaxAmount + countyTaxAmount + retailPrice;

        System.out.println( "The retail price of the item was $" +  chosenFormat.format(retailPrice) + "\n" +
                            "The state tax came to a total of $" + chosenFormat.format(stateTaxAmount) + "\n" +
                            "The county tax came to a total of $" + chosenFormat.format(countyTaxAmount) + "\n" +
                            "The total cost of the item came to $" + chosenFormat.format(totalCost));
    }
}
