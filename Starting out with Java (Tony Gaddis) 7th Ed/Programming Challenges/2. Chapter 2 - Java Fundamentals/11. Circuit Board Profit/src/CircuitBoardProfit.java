import java.text.DecimalFormat;
import java.util.Scanner;

public class CircuitBoardProfit {
/*
    An electronics company sells circuit boards at a 40 percent profit. If you know the retail price of a circuit board,
    you can calculate its profit with the following formula:

    Profit=Retail price×0.4

    Write a program that asks the user for the retail price of a circuit board, calculates the amount of profit earned
    for that product, and displays the results on the screen.
*/
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("#,###.##");
        double retailPrice;
        final double PROFIT_PERCENTAGE = 0.4;

        System.out.println("Please insert the retail price of the circuit board in question.");
        retailPrice = keyboard.nextDouble();

        double companyProfit = retailPrice * PROFIT_PERCENTAGE;

        System.out.println( "The retail price of the board is $" + format.format(retailPrice));
        System.out.println( "The amount of profit the company will make is $" + format.format(companyProfit) +
                            " for the board.");
    }
}
