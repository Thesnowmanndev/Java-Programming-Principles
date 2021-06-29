/*
 * This program was written by Kyle Martin on 6/03/2021 for CPT421 Java Programming Principles 1 during Summer Session 1
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was created to show I know how to print a word depending on a random number generated.
 * See Chapter 4 Algorithm Workbench Question 16.
 */
import java.util.Random;

public class ReviewQuestion16 {
    public static void main(String[] args) {
        // Do 10 times
        // Generate random number 0 or 1
        // Display words Yes or No depending on number generated

        int iterationNumber = 1;
        for (int i = 0; i < 10; i++) {
            Random randomNumbers = new Random();
            int number;

            String isOne = "Yes";
            String isZero = "No";

            number = randomNumbers.nextInt(2);
            System.out.print("Iteration: " + iterationNumber + " - " + "Number equals: " + number + " ");
            if (number == 1) {
                System.out.println(isOne);
            }
            else {
                System.out.println(isZero);
            }
            iterationNumber++;
        }
    }
}
