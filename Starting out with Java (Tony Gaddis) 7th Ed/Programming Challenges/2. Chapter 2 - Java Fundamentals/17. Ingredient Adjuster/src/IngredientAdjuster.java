import java.text.DecimalFormat;
import java.util.Scanner;

public class IngredientAdjuster {
    /*
    A cookie recipe calls for the following ingredients:

            - 1.5 cups of sugar
            - 1 cup of butter
            - 2.75 cups of flour

    The recipe produces 48 cookies with these amounts of the ingredients. Write a program that asks the user how many
    cookies he or she wants to make, and then displays the number of cups of each ingredient needed for the specified
    number of cookies.
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("#,###.##");
        final double AMOUNT_OF_COOKIES_PER_RECIPE = 48;
        final double AMOUNT_OF_SUGAR_PER_COOKIE_IN_CUPS = 1.5 / AMOUNT_OF_COOKIES_PER_RECIPE;
        final double AMOUNT_OF_BUTTER_PER_COOKIE_IN_CUPS = 1 / AMOUNT_OF_COOKIES_PER_RECIPE;
        final double AMOUNT_OF_FLOUR_PER_COOKIE_IN_CUPS = 2.75 / AMOUNT_OF_COOKIES_PER_RECIPE;

        int amountOfCookiesDesired;

        System.out.println( "How many cookies do you want to make?");
        amountOfCookiesDesired = keyboard.nextInt();

        double amountOfSugarNeeded = AMOUNT_OF_SUGAR_PER_COOKIE_IN_CUPS * amountOfCookiesDesired;
        double amountOfButterNeeded = AMOUNT_OF_BUTTER_PER_COOKIE_IN_CUPS * amountOfCookiesDesired;
        double amountOfFlourNeeded = AMOUNT_OF_FLOUR_PER_COOKIE_IN_CUPS * amountOfCookiesDesired;

        System.out.println();
        System.out.println( "You need " + format.format(amountOfSugarNeeded) +
                            " cups of sugar for your desired amount of cookies");
        System.out.println( "You need " + format.format(amountOfButterNeeded) +
                            " cups of butter for your desired amount of cookies");
        System.out.println( "You need " + format.format(amountOfFlourNeeded) +
                            " cups of flour for your desired amount of cookies");
    }
}
