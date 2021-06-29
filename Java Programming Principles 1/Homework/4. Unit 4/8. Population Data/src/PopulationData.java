/*
 * This program was written by Kyle Martin on 6/13/2021 for CPT421 Java Programming Principles 1 during Summer Session 1
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was created to pull data from a text file and display the year that had the minimum growth, maximum
 * growth, and the average growth of all the years.
 * See Chapter 7 Programming Exercise 15 Population Data
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class PopulationData {
    private static final DecimalFormat FORMAT_NUMBER = new DecimalFormat("#,###.##");

    // Get Average of Change in Population throughout the years
    private static double averageAnnualChange(int[] population) {
        double changeInPopulation = 0;

        for (int i = 0; i < population.length - 1; i++) {
            changeInPopulation += population[i+1] - population[i];
        }

        return changeInPopulation/population.length;
    }

    // Get Maximum growth of Population year
    private static int getMaximumIncreaseYear(int[] population) {
        int maxPopulation = population[1] - population[0];
        int maxYear = 1950;

        for (int year = 1; year < population.length - 1; year++) {
            int popChange = population[year + 1] - population[year];
            if (popChange > maxPopulation) {
                maxPopulation = popChange;
                maxYear = maxYear + year;
            }
        }

        return maxYear;
    }

    // Get Minimum growth of Population year
    private static int getMinimumIncreaseYear(int[] population) {
        int minPopulation = population[1] - population[0];
        int minYear = 1950;

        for (int year = 1; year < population.length - 1; year++) {
            int popChange = population[year + 1] - population[year];
            if (popChange < minPopulation) {
                minPopulation = popChange;
                minYear = minYear + year;
            }
        }

        return minYear;
    }

    public static void main(String[] args) {
        // Get Data
        String filePathName = "src/USPopulation.txt";
        final int NUMBER_OF_YEARS = 41;
        int[] population = new int[NUMBER_OF_YEARS];

        int startIndex = 0;
        try {
            Scanner fileRead = new Scanner(new File(filePathName));

            while(fileRead.hasNextInt()) {
                population[startIndex]= fileRead.nextInt();
                startIndex++;
            }

            fileRead.close();

            // Display Data
            double avgChange = averageAnnualChange(population);
            System.out.println("Average annual change in population: " + FORMAT_NUMBER.format(avgChange));

            int maxYear = getMaximumIncreaseYear(population);
            System.out.println("Year that had the maximum growth in population: " + maxYear);

            int minYear = getMinimumIncreaseYear(population);
            System.out.println("Year that had the least amount of growth in population: " + minYear);
        }
        // Unable to Retrieve Data
        catch (FileNotFoundException e) {
            System.out.println("File does not exist.");
        }
    }
}
