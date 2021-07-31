/*
 * This program was written by Kyle Martin on 7/31/2021 for Java Programming Principles 2 during Summer Session 2
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was created to perform multiplication of two given integers using recursion
 * See Chapter 15 Programming Challenges  - Challenge One.
 */
import java.util.Scanner;

public class RecursiveMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        System.out.println("Enter the first number:");
        x = scanner.nextInt();
        System.out.println("Enter the second number:");
        y = scanner.nextInt();

        int result = multiplication (x, y);

        System.out.println(x + " times " + y + " is " + result);
        scanner.close();
    }

    private static int multiplication(int x, int y) {
        if (y != 0) {
            return (x + multiplication(x, y-1));
        } else {
            return 0;
        }
    }
}
