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
