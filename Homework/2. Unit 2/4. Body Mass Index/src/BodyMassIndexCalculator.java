/*
 * This program was written by Kyle Martin on 5/27/2021 for CPT421 Java Programming Principles 1 during Summer Session 1
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program calculates the BMI of the user.
 */
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class BodyMassIndexCalculator {
    public static void main(String[] args) {
        // Scanner and number format
        Scanner userInput = new Scanner(System.in);
        NumberFormat bmiFormat = new DecimalFormat("##.##");

        // Questionnaire:
        System.out.println("Welcome to the Body Mass Index calculator!");
        System.out.println("Please type in your weight in pounds. Ex. 185 for 185 lbs.");
        double weight = userInput.nextDouble();
        System.out.println("Please type in your height in inches. Ex 67 for 67 inches.");
        double height = userInput.nextInt();

        // Calculations:
        double bmi = (weight * 703) / (height * height);

        // Output:
        System.out.println("Your BMI is: " + bmiFormat.format(bmi) + ".");
        if (bmi < 18.5){
            System.out.println("You are underweight");
        } else if (bmi < 25){
            System.out.println("You are normal weight");
        } else {
            System.out.println("You are overweight.");
        }
    }
}
