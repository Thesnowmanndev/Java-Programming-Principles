/*
 * Book: Starting Out with Java, 7th Edition by Tony Gaddis
 * Program Author: Kyle Martin | https://github.com/thesnowmanndev
 * This program was created to predict how many sales a fictional companies division generates.
 * */
import java.text.DecimalFormat;

public class SalesPrediction {
    public static void main(String[] args) {
        String company = "East Coast", division = "Sales Division";
        double percentage = 0.62;
        double companyTotalRevenueGenerated = 4600000.00;
        double divisionTotalRevenueGenerated = companyTotalRevenueGenerated * percentage;

        // Format Number
        DecimalFormat chosenFormat = new DecimalFormat("#,###");


        System.out.println( "The " + company + " " + division + " is projected to generate $" +
                            chosenFormat.format(divisionTotalRevenueGenerated) + " out of the $" +
                            chosenFormat.format(companyTotalRevenueGenerated) + " the " + company +
                            " company has made this year.");
    }
}
