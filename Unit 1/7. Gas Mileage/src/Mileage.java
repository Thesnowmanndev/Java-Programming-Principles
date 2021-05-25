/*
 * This program was written by Kyle Martin on 5/22/2021 for CPT421 Java Programming Principles 1 during Summer Session 1
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This app is written to help its users mpg from a trip.
 */

import java.util.Scanner;

public class Mileage {
    public static void main(String[] args) {
        // Declarations
        Scanner appScanner = new Scanner(System.in);
        float milesDriven;
        float gallonsUsed;
        float milesPerGallon;

        // Questions & Assignment
        System.out.println("This program will calculate the mileage of your vehicle. \n" +
                "How many miles did you drive? Example: 14.5 or 14.");
        milesDriven = appScanner.nextFloat();
        System.out.println("How many gallons of gas did you use? Example: 4.");
        gallonsUsed = appScanner.nextFloat();

        // Calculations
        milesPerGallon = milesDriven / gallonsUsed;
        float milesPerGallonRounded = (float) (Math.round(milesPerGallon * 10) / 10.0);

        // Output
        System.out.println("You drove " + milesDriven + " miles. " + "You used " + gallonsUsed + " gallons. " +
                "You achieved " + milesPerGallonRounded + "mpg.");
    }
}
