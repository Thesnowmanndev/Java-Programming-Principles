/*
 * This program was written by Kyle Martin on 7/31/2021 for Java Programming Principles 2 during Summer Session 2
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was created to print the value 10 to the console
 * See Chapter 15 Algorithm Workbench  - Question Three.
 */
public class Checkpoint
{
    public static void main(String[] args)
    {
        int num = 0;
        showMe(num);
    }
    public static void showMe(int arg)
    {
        if (arg < 10)
            showMe(arg + 1); // Program first adds 1 until the value of num is 10
        else
            System.out.println(arg); // Once the program is 10 it prints out 10 and the program stops
    }
}