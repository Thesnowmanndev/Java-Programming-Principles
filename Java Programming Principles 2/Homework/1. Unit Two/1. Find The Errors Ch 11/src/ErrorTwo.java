/*
 * This program was written by Kyle Martin on 7/17/2021 for Java Programming Principles 2 during Summer Session 2
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was created to fix a error in sudo code
 * See Chapter 11 Find the Error Question 2.
 */
import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ErrorTwo { // Created class to store error question - Not apart of sudo code
    public void fixErrorTwo() {
        // Added declarations to remove errors
        File file;
        Scanner inputFile = null;
        int input;

        try
        {
            input = inputFile.nextInt();
        }
        catch (InputMismatchException e)
        {
            System.out.println(e.getMessage());
        }
        finally // Moved below catch block
        {
            inputFile.close();
        }
    }
}
