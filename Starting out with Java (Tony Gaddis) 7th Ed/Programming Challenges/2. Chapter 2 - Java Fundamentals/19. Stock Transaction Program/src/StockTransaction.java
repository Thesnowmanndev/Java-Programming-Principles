/*
* This program was written by Kyle Martin on 6/27/2021
* The point of this console program is to calculate the total profit or loss of a Stock Exchange Transaction
*
* See Starting out with Java, From control structures through Objects 7th Edition
* Chapter 2 Program Challenge 19. Stock Transaction Program
* */

import java.text.DecimalFormat;

public class StockTransaction {
    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("#,###.##"); // Not part of challenge but looks nice

        String clientName = "Joe";
        double numberOfSharesPurchased = 1000;
        double priceOfEachStockPurchased = 32.87;
        double commissionPercentage = 0.02;

        double numberOfSharesSold = numberOfSharesPurchased;
        double priceOfEachStockSold = 33.92;

        // Amount of money paid for stocks
        double totalAmountPaidForPurchase = numberOfSharesPurchased * priceOfEachStockPurchased;
        System.out.println( clientName + " paid $" + format.format(totalAmountPaidForPurchase) + " for "
                            + numberOfSharesPurchased + " stocks.");

        // Amount of money paid in commission for purchase
        double totalCommissionPaid = totalAmountPaidForPurchase * commissionPercentage;
        System.out.println( clientName + " paid $" + format.format(totalCommissionPaid) + " in commission for the " +
                            "purchase of " + numberOfSharesPurchased + " stocks.");

        // Amount of money sold stocks
        double totalAmountSold =  numberOfSharesSold * priceOfEachStockSold;
        System.out.println( clientName + " sold " + numberOfSharesSold + " stocks for a total amount of $" +
                            format.format(totalAmountSold) + ".");

        // Amount of money paid in commission for sale
        double totalCommissionPaidForSale = totalAmountSold * commissionPercentage;
        System.out.println( clientName + " paid $" + format.format(totalCommissionPaidForSale) + " in commission " +
                            "for the sale of " + numberOfSharesSold + " stocks.");

        // Display Profit or Losses
        double moneyAfterSale = totalAmountSold - totalAmountPaidForPurchase;
        double totalAmountPaidInCommission = totalCommissionPaid + totalCommissionPaidForSale;
        double totalNetProfit =  moneyAfterSale - totalAmountPaidInCommission;
        if (totalNetProfit < 0 ) {
            System.out.println( clientName + " lost $" + format.format(totalNetProfit) + " in the transaction.");
        } else if (totalNetProfit > 0) {
            System.out.println( clientName + " gained $" + format.format(totalNetProfit) + " in the transaction.");
        }
    }
}
