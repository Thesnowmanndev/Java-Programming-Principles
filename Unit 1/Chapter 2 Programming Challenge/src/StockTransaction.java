/*
 * This program was written by Kyle Martin on 5/22/2021 for CPT421 Java Programming Principles 1 during Summer Session 1
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This app is written to help its users calculate how much Joe made from the stock market.
 */

public class StockTransaction {
    public static void main(String[] args) {
        // Initial Declarations
        int purchasedStocks = 1000;
        double purchasedPrice = 32.87;
        double salePrice = 33.92;
        double commissionRate = 0.02;

        // Initial Calculation
        double purchasedStockTotal = purchasedStocks * purchasedPrice;
        double purchaseCommissionTotal = purchasedStockTotal * commissionRate;
        double purchasePriceTotal =  purchasedStockTotal + purchaseCommissionTotal;
        System.out.println("Joe paid $" + purchasedStockTotal + " for " + purchasedStocks + " stocks.");
        System.out.println("Joe paid $" + purchaseCommissionTotal + " of commission for the purchased stocks.");
        System.out.println("Joe's total investment came to $" + purchasePriceTotal + ".");

        // Sale Calculations
        double saleStockTotal = purchasedStocks * salePrice;
        double saleCommissionPaid = saleStockTotal * commissionRate;
        double salePriceTotal = saleStockTotal - saleCommissionPaid;
        System.out.println("Joe sold the " + purchasedStocks + " stocks for $" + saleStockTotal + ".");
        System.out.println("Joe paid $" + saleCommissionPaid + " in commission to his broker for the sale of the stocks.");

        // Final Calculations
        double grandTotal = purchasePriceTotal - salePriceTotal;
        float grandTotalRounded = (float) (Math.round(grandTotal * 100) / 100.0);
        System.out.println("Joe's total profit came to $" + grandTotalRounded + " after paying commission.");
    }
}
