/*
 * This program was written by Kyle Martin on 6/06/2021 for CPT421 Java Programming Principles 1 during Summer Session 1
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was to record and average the amount of rainfall in a given set of years
 * See Chapter 4 Programming Challenge 8 Average Rainfall.
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class AverageRainfall {
/*
 Write a program that uses nested loops to collect data and calculate the average rainfall over a period of years.
 First the program should ask for the number of years. The outer loop will iterate once for each year.
 The inner loop will iterate 12 times, once for each month. Each iteration of the inner loop will ask the user for
 the inches of rainfall for that month. After all iterations, the program should display the number of months,
 the total inches of rainfall, and the average rainfall per month for the entire period.
 Input Validation: Do not accept a number less than 1 for the number of years. Do not accept negative numbers for the
 monthly rainfall.
*/
    public static void main(String[] args) {
        int numberOfYears, numberOfMonths;
        double totalInchesOfRainfall = 0;
        double accumulatedRainfall = 0;
        double averageRainfallPerMonth = 0;
        DecimalFormat formatter = new DecimalFormat("0.00");

        // Record number of Years
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of years.");
        numberOfYears = input.nextInt();

        numberOfMonths = numberOfYears * 12;

        // Validate User Input
        while (numberOfYears < 1) {
            System.out.println("Please enter a value greater than one.");
            numberOfYears = input.nextInt();
        }

        // Record data per month
        for (int year = 1; year <= numberOfYears; year+=1) {
            int count = 0;
            do {
                System.out.println("Enter the rainfall for this month.");
                totalInchesOfRainfall = input.nextDouble();

                // Validate User Input
                while (totalInchesOfRainfall <= 0) {
                    System.out.println("Negative numbers not allowed. Please input a valid number.");
                    totalInchesOfRainfall = input.nextDouble();
                }
                accumulatedRainfall += totalInchesOfRainfall;
                count ++;
                System.out.println("Month: " + count + ", year: " + year);
            } while (count < 12);

            System.out.println("Year: " + year + " entries complete.");
        }

        averageRainfallPerMonth = accumulatedRainfall / numberOfMonths;

        // Output
        System.out.println("Number of months: " + numberOfMonths);
        System.out.println("The total inches of rainfall was: " + accumulatedRainfall + " inches.");
        System.out.println("The average rainfall is: " + formatter.format(averageRainfallPerMonth) + " inches.");
    }
}
