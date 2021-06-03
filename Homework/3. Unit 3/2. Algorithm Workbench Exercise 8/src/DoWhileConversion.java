/*
 * This program was written by Kyle Martin on 6/03/2021 for CPT421 Java Programming Principles 1 during Summer Session 1
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was created to show I know how to convert a do-while statement to a while statement
 * See Chapter 4 Algorithm Workbench Question 8.
 */
import java.util.Scanner;

public class DoWhileConversion {
    public static void main(String[] args) {
        /*
        Convert:
        Scanner keyboard = new Scanner(System.in);
        String input;
        char sure;
        do {
            System.out.println("Are you sure you want to quit? ");
            input = keyboard.next();
            sure = input.charAt(0);
        } while (sure != 'Y' && sure != 'N');
        */

        Scanner keyboard = new Scanner(System.in);
        String input;
        char sure = 0;

        while (sure != 'Y' && sure != 'N') {
            System.out.println("Are you sure you want to quit? ");
            input = keyboard.next();
            sure = input.charAt(0);
        }
    }
}
