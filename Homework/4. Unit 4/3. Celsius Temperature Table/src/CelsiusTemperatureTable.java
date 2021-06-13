/*
 * This program was written by Kyle Martin on 6/12/2021 for CPT421 Java Programming Principles 1 during Summer Session 1
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was created to convert Fahrenheit to Celsius and display it in a table
 * See Chapter 5 Programming Challenge 6 Celsius Temperature Table.
 */

import java.text.DecimalFormat;

public class CelsiusTemperatureTable {

    private static final DecimalFormat format = new DecimalFormat("#,###.##");

    private static double celsius(double fahrenheit) {
        double celsius;
        celsius =  (0.5555555555555556)  * ( fahrenheit - 32);
        return celsius;
    }

    private static void displayHeading() {
        System.out.println("Fahrenheit Temperature\t\tCelsius Equivalent\n--------------\t\t\t\t--------------\n");
    }

    public static void main(String[] args) {
        displayHeading();
        double celsiusEquivalent;
        for (double currentFahrenheitTemperature = 0; currentFahrenheitTemperature <= 20; currentFahrenheitTemperature++) {
            celsiusEquivalent = celsius( currentFahrenheitTemperature );
            System.out.println(format.format(currentFahrenheitTemperature) + "\t\t\t\t\t\t\t" + format.format(celsiusEquivalent));
        }
    }

}
