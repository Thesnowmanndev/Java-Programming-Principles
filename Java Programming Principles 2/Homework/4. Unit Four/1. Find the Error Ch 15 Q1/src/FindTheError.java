/*
 * This program was written by Kyle Martin on 7/31/2021 for Java Programming Principles 2 during Summer Session 2
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was created to fix an error in given sudo code
 * See Chapter 15 Find the Error  - Question One.
 */

public class FindTheError
{
    public static void main(String[] args)
    {
        myMethod(0);
    }
    public static void myMethod(int num)
    {
        if (num > 0) { // Removed endless recursion by adding an if statement
            System.out.print(num + " ");
            myMethod(num + 1);
        }
    }
}