/*
 * This program was written by Kyle Martin on 6/06/2021 for CPT421 Java Programming Principles 1 during Summer Session 1
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was created to display a square on the screen based on the length of the square the user inputs
 * See Chapter 4 Programming Challenge 20 Square Display.
 */

import java.util.Scanner;

public class SquareDisplay {
/*    Write a program that asks the user for a positive integer no greater than 15. The program should then display a
    square on the screen using the character ‘X’. The number entered by the user will be the length of each side of the
    square. For example, if the user enters 5, the program should display the following:

            XXXXX
            XXXXX
            XXXXX
            XXXXX
            XXXXX

    If the user enters 8, the program should display the following:

            XXXXXXXX
            XXXXXXXX
            XXXXXXXX
            XXXXXXXX
            XXXXXXXX
            XXXXXXXX
            XXXXXXXX
            XXXXXXXX
*/
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int userInput;

        // Question for number
        System.out.println("Please enter a positive number not greater than 15.");
        userInput = keyboard.nextInt();

        // Input Validations
        while (userInput < 1 || userInput > 15) {
            System.out.println("Please re-enter a positive number not greater than 15 but more than 0.");
            userInput = keyboard.nextInt();
        }

        // Print square made of Xs
        for (int row = 1; row <= userInput; row++) {
            for (int column = 1; column <= userInput; column++) {
                System.out.print("X");
            }
            System.out.println();
        }
    }
}
