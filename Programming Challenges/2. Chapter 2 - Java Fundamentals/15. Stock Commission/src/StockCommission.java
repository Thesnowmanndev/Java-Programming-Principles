import java.text.DecimalFormat;

public class StockCommission {
    /*
    Kathryn bought 600 shares of stock at a price of $21.77 per share. She must pay her stock-broker a 2 percent
    commission for the transaction. Write a program that calculates and displays the following:

    - The amount paid for the stock alone (without the commission)
    - The amount of the commission
    - The total amount paid (for the stock plus the commission)
     */
    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("#,###.##");
        int amountOfStocksPurchased = 600;
        double purchaseTransactionPrice = 21.77;
        final double STOCK_BROKER_PERCENTAGE = 0.02;

        double amountPaidToBroker = (amountOfStocksPurchased * purchaseTransactionPrice) * STOCK_BROKER_PERCENTAGE;

        System.out.println( "Kathryn paid $" + format.format(amountOfStocksPurchased * purchaseTransactionPrice)
                            + " for " + amountOfStocksPurchased + " stocks.");
        System.out.println("The stock broker commission came to $" + format.format(amountPaidToBroker));
        double totalPaid = (amountOfStocksPurchased * purchaseTransactionPrice) + amountPaidToBroker;
        System.out.println("Kathryn paid a total of $" + format.format(totalPaid));
    }
}
