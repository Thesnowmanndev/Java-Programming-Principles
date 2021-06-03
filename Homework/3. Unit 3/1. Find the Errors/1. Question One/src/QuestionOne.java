/*
 * This program was written by Kyle Martin on 6/03/2021 for CPT421 Java Programming Principles 1 during Summer Session 1
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was created to fix the errors in question 1
 * See Chapter 4 Find the Error Question 1.
 */
import java.util.Scanner;

public class QuestionOne {
    public static void main(String[] args) {
        int num1, num2;
        String input;
        char again = 0; // Initialized to 0

        Scanner keyboard = new Scanner(System.in);
        while (again == 'y' || again == 'Y')
            System.out.print("Enter a number: ");
            num1 = keyboard.nextInt();
            System.out.print("Enter another number: "); // Added end parenthesis
            num2 = keyboard.nextInt();
            System.out.println("Their sum is "+ (num1 + num2));
            System.out.println("Do you want to do this again? ");
            keyboard.nextLine(); 
            input = keyboard.nextLine();
            again = input.charAt(0);
    }
}
