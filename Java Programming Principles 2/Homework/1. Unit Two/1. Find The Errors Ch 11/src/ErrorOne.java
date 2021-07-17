/*
 * This program was written by Kyle Martin on 7/17/2021 for Java Programming Principles 2 during Summer Session 2
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was created to fix a error in sudo code
 * See Chapter 11 Find the Error Question 1.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ErrorOne { // Created class to store error - Not apart of error example
    void fixErrorOne() { // Created method to store error - Not apart of error example
        try // Placed Try block before catch block
        {
            File file = new File("MyFile.txt");
            Scanner inputFile = new Scanner(file);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found.");
        }
    }
}
