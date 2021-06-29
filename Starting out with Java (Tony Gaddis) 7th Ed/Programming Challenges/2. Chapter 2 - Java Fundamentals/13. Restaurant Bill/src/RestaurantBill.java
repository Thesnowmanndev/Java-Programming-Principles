import java.text.DecimalFormat;
import java.util.Scanner;

public class RestaurantBill {
    /*
    Write a program that computes the tax and tip on a restaurant bill. The program should ask the user to enter the
    charge for the meal. The tax should be 6.75 percent of the meal charge. The tip should be 20 percent of the total
    after adding the tax. Display the meal charge, tax amount, tip amount, and total bill on the screen.
    */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("#,###.##");

        final double TAX_PERCENTAGE = 0.0675;
        final double TIP_PERCENTAGE = 0.2;
        double mealPrice;

        System.out.println("Please enter the price of your meal.");
        mealPrice = keyboard.nextDouble();

        double taxAmount = mealPrice * TAX_PERCENTAGE;
        double preTipTotal = mealPrice + taxAmount;
        double tipTotal = (mealPrice + taxAmount) * TIP_PERCENTAGE;
        double mealTotal = mealPrice + taxAmount + tipTotal;

        System.out.println("The price of your meal was $" + format.format(mealPrice));
        System.out.println("The tax on a $" + format.format(mealPrice) + " meal is $" + format.format(taxAmount));
        System.out.println("Your pre-tip total comes to $" + format.format(preTipTotal));
        System.out.println("Your 20% tip comes to $" + format.format(tipTotal));
        System.out.println("The total price of your trip comes to $" + format.format(mealTotal));
    }
}
