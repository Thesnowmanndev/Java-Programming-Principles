/*
 * Book: Starting Out with Java, 7th Edition by Tony Gaddis
 * Program Author: Kyle Martin | https://github.com/thesnowmanndev
 * This program was created to calculate the miles per gallon a car has gotten.
 * */

import java.text.DecimalFormat;
import java.util.Scanner;

public class MilesPerGallon {
    public static void greetUser() {
        System.out.println("""
                Welcome to the Miles Per Gallon (MPG) Calculator!\s
                This program will calculate how many miles per gallon you got during your trip.\s
                """);
    }
    static double calculateMPG(double milesDriven, double gallonsUsed) {
        return milesDriven / gallonsUsed;
    }
    static String formatMPG(double mpgToBeFormatted) {
        DecimalFormat mpgFormat = new DecimalFormat("###.#");
        return mpgFormat.format(mpgToBeFormatted);
    }
    static void outputLogic() {
        Scanner userInput = new Scanner(System.in);

        System.out.println("How many miles did you drive?");
        double userMiles = userInput.nextDouble();
        System.out.println("How many gallons did you use?");
        double userGallons = userInput.nextDouble();
        double userMilesPerGallon = calculateMPG(userMiles, userGallons);
        String userMilesPerGallonFormatted = formatMPG(userMilesPerGallon);

        System.out.println("On your trip you drove " + userMiles + " miles, consumed " + userGallons + " gallons. " +
                "You got " + userMilesPerGallonFormatted + " mpg during your trip.");
    }
    public static void main(String[] args) {
        greetUser();
        outputLogic();
    }
}
