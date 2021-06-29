/*
 * This program was written by Kyle Martin on 5/27/2021 for CPT421 Java Programming Principles 1 during Summer Session 1
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program calculates the average test scores of 3 tests and reports what grade they received on average.
 */

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class TestScoresGrade {
    public static void main(String[] args) {
        // Scanner & Number Format
        Scanner userInput = new Scanner(System.in);
        NumberFormat formattedScore = new DecimalFormat("##.##");

        // Questionnaire
        System.out.println("Welcome to the Test Score Average Calculator!");
        System.out.println("This application will take the average of three test scores and calculate your average as "+
                "well as tell you your grade.");
        System.out.println("What was the score of your first test? Ex. 90 for 90%.");
        double testOneScore = userInput.nextDouble();
        System.out.println("What was the score of your second test? Ex. 75 for 75%.");
        double testTwoScore = userInput.nextDouble();
        System.out.println("What was the score of your third test? Ex. 84 for 84%.");
        double testThreeScore = userInput.nextDouble();

        // Calculation
        double averageScore = (testOneScore + testTwoScore + testThreeScore) / 3;

        /*
         Output Section
         * 90-110 A
         * 80-89 B
         * 70-79 C
         * 60-69 D
         * < 60 F
        */
        int testAverageCase;
        if (averageScore >= 90 && averageScore <= 110) {
            testAverageCase = 1;
        } else if (averageScore >= 80 && averageScore <= 89) {
            testAverageCase = 2;
        } else if (averageScore >= 70 && averageScore <= 79) {
            testAverageCase = 3;
        } else if (averageScore >= 60 && averageScore <= 69) {
            testAverageCase = 4;
        } else {
            testAverageCase = 5;
        }

        switch (testAverageCase) {
            case 1 -> System.out.println(   "Your average test score was: " + formattedScore.format(averageScore) +
                                            " and your average grade was a 'A'.");
            case 2 -> System.out.println(   "Your average test score was: " + formattedScore.format(averageScore) +
                                            " and your average grade was a 'B'.");
            case 3 -> System.out.println(   "Your average test score was: " + formattedScore.format(averageScore) +
                                            " and your average grade was a 'C'.");
            case 4 -> System.out.println(   "Your average test score was: " + formattedScore.format(averageScore) +
                                            " and your average grade was a 'D'.");
            case 5 -> System.out.println(   "Your average test score was: " + formattedScore.format(averageScore) +
                                            " and your average grade was a 'F'.");
            default -> System.out.println(  "You entered your scores incorrectly. Please try again.");
        }
    }
}
